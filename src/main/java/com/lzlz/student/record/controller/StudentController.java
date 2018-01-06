package com.lzlz.student.record.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.lzlz.student.record.entiy.Student;
import com.lzlz.student.record.entiy.Teacher;
import com.lzlz.student.record.service.StudentService;
import com.lzlz.student.record.util.CustomerUtil;
import com.lzlz.student.record.util.ExcelProcess;

@Controller
@RequestMapping("/Student")
public class StudentController {
	private StudentService studentService;

	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, HttpSession session, String username, String password) {
		Student student = studentService.getStudentBySno(Long.parseLong(username));
		if (student == null) {
			request.setAttribute("ret", 1);
			return "retprocess";
		}
		if (!(username.equals(password))) {
			request.setAttribute("ret", 2);
			return "retprocess";
		}
		session.setAttribute("student", student);
		request.setAttribute("ret", 3);
		return "retprocess";
	}

	@RequestMapping(value = "/insertByList", method = RequestMethod.POST)
	public String insert(@RequestParam("excel") MultipartFile file, HttpServletRequest request, HttpSession session)
			throws IOException {
		Teacher t = (Teacher) session.getAttribute("teacher");
		String result = ExcelProcess.studentProcess(studentService, file.getInputStream(), t.getTfrom());
		request.setAttribute("ret", 15);
		request.setAttribute("result", result);
		return "retprocess";
	}

	@RequestMapping(value = "/select", method = RequestMethod.GET)
	public String select(@RequestParam("id") long l, HttpServletRequest request) {
		List<Long> list = studentService.getAllId();
		if (list.contains(l)) {
			System.out.println("the id is exist");
			request.setAttribute("content", "天依殿下我爱你");
		}
		return "index";
	}

	@RequestMapping(value = "/updateByStudent", method = RequestMethod.POST)
	public String update(String sphone, String sparent, String sparent_phone, String sjob, HttpServletRequest request,
			HttpSession session) {
		Student student = (Student) session.getAttribute("student");
		student.setSphone(sphone);
		student.setSparent(sparent);
		student.setSparentPhone(sparent_phone);
		student.setSjob(sjob);
		int ret = studentService.updateByStudent(student);
		if (ret != 0)
			request.setAttribute("ret", 4);
		else
			request.setAttribute("ret", 5);
		return "retprocess";
	}

	@RequestMapping(value = "/updateByTeacher", method = RequestMethod.POST)
	public String updateByTeacher(Student student, HttpServletRequest request, HttpSession session) {
		student.setTfrom(((Teacher) session.getAttribute("teacher")).getTfrom());
		int ret = studentService.updateByStudent(student);
		if (ret != 0)
			request.setAttribute("ret", 4);
		else
			request.setAttribute("ret", 5);
		return "retprocess";
	}

	@RequestMapping(value = "/selectBySno", method = RequestMethod.GET)
	public String selectBySno(@RequestParam("sno") long sno, HttpServletRequest request, HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		Student student = studentService.getStudentBySno(sno);
		if (student == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		if (student.getTfrom() != t.getTfrom()) {
			request.setAttribute("ret", -1);
			return "retprocess";
		} else {
			request.setAttribute("updatestudent", student);
			return "teacher_studentupdate";
		}
	}

	@RequestMapping(value = "/deleteBySno", method = RequestMethod.GET)
	public String deleteBySno(@RequestParam("sno") long sno, HttpServletRequest request, HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		Student student = studentService.getStudentBySno(sno);
		if (student == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		if (student.getTfrom() != t.getTfrom()) {
			request.setAttribute("ret", -1);
			return "retprocess";
		} else {
			int ret = studentService.deleteBySno(sno);
			if (ret != 0)
				request.setAttribute("ret", 12);
			else
				request.setAttribute("ret", 13);
			return "retprocess";
		}
	}

	@RequestMapping(value = "/insertByStudent", method = RequestMethod.GET)
	public @ResponseBody int insertByStudent() {
		return studentService.insertByStudent(new Student(201615230142L, "张路平", "女", 2016, 1, "软件与信息服务", "二次元",
				"+8617862733349", "张进强", "+8617865058755", "无", 1601, "在校"));
	}

	@RequestMapping(value = "/selectAllByTno", method = RequestMethod.GET)
	public String selectAllByTno(HttpServletRequest request, HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		List<Student> list = studentService.selectAllByTno(t.getTfrom());
		request.setAttribute("studentlist", list);
		return "teacher_stumanager";
	}
}
