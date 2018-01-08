package com.lzlz.student.record.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.lzlz.student.record.entiy.Student;
import com.lzlz.student.record.entiy.StudentTextbook;
import com.lzlz.student.record.entiy.Teacher;
import com.lzlz.student.record.entiy.Well;
import com.lzlz.student.record.service.StudentService;
import com.lzlz.student.record.service.StudentTextbookService;
import com.lzlz.student.record.util.ExcelProcess;

@Controller
@RequestMapping("/StudentTextbook")
public class StudentTextbookController {
	private StudentTextbookService studentTextbookService;
	private StudentService studentService;

	@Autowired
	public void setStudentTextbookService(StudentTextbookService studentTextbookService) {
		this.studentTextbookService = studentTextbookService;
	}

	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping(value = "/insertByTeacher", method = RequestMethod.POST)
	public String insertByStudentTextbook(StudentTextbook studentTextbook, HttpServletRequest request) {
		studentTextbook.setState("未确认");
		int ret = studentTextbookService.insertByStudentTextbook(studentTextbook);
		if (ret != 0)
			request.setAttribute("ret", 6);
		else
			request.setAttribute("ret", 7);
		return "retprocess";
	}

	@RequestMapping(value = "/insertByList", method = RequestMethod.POST)
	public String insertByList(@RequestParam("excel") MultipartFile file, HttpServletRequest request,
			HttpSession session) throws IOException {
		String oldname = file.getOriginalFilename();
		if (!oldname.substring(oldname.indexOf('.')).equalsIgnoreCase(".xls")) {
			request.setAttribute("ret", 14);
			return "retprocess";
		}
		String result = ExcelProcess.studentTextbookProcess(studentTextbookService, file.getInputStream());
		request.setAttribute("ret", 15);
		request.setAttribute("result", result);
		return "retprocess";
	}

	@RequestMapping(value = "/selectBySnoWithNoPass", method = RequestMethod.GET)
	public String selectBySnoWithNoPass(HttpServletRequest request, HttpSession session) {
		Student student = (Student) session.getAttribute("student");
		if (student == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		request.setAttribute("stutextbookManagerlist", studentTextbookService.selectBySnoWithNoPass(student.getSno()));
		return "student_stutextbookManager";
	}

	@RequestMapping(value = "/updateByStno", method = RequestMethod.POST)
	public String updateByStno(@RequestParam("stno") long stno, HttpServletRequest request) {
		int ret = studentTextbookService.updateByStno(stno);
		if (ret != 0)
			request.setAttribute("ret", 9);
		else
			request.setAttribute("ret", 10);
		return "retprocess";
	}

	@RequestMapping("/selectByTno")
	public String selectByTno(HttpServletRequest request, HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		List<StudentTextbook> studentTextbooklist = studentTextbookService.selectByTno(t.getTfrom());
		request.setAttribute("studentTextbooklist", studentTextbooklist);
		return "teacher_stutextbookmanager";
	}

	@RequestMapping(value = "/deleteByNoPass", method = RequestMethod.GET)
	public String deleteByNoPass(@RequestParam("stno") long stno, HttpServletRequest request, HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		StudentTextbook studentTextbook = studentTextbookService.selectStudentTextbookByStno(stno);
		Student student = studentService.getStudentBySno(studentTextbook.getSno());
		if (t.getTfrom() != student.getTfrom()) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		int ret = studentTextbookService.deleteByStno(stno);
		if (ret != 0)
			request.setAttribute("ret", 12);
		else
			request.setAttribute("ret", 13);
		return "retprocess";
	}

	@RequestMapping(value = "selectByStno", method = RequestMethod.GET)
	public String selectByStno(@RequestParam("stno") long stno, HttpServletRequest request, HttpSession session) {
		Student student = (Student) session.getAttribute("student");
		if (student == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		StudentTextbook studentTextbook = studentTextbookService.selectStudentTextbookByStno(stno);
		if (studentTextbook.getSno() != student.getSno()) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		request.setAttribute("stubooktemp", studentTextbook);
		return "student_stubookupdate";
	}
}
