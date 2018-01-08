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

import com.lzlz.student.record.entiy.Criticism;
import com.lzlz.student.record.entiy.Student;
import com.lzlz.student.record.entiy.Teacher;
import com.lzlz.student.record.service.CriticismService;
import com.lzlz.student.record.service.StudentService;
import com.lzlz.student.record.util.ExcelProcess;

@Controller
@RequestMapping("/Criticism")
public class CriticismController {
	private CriticismService criticismService;
	private StudentService studentService;

	@Autowired
	public void setCriticismService(CriticismService criticismService) {
		this.criticismService = criticismService;
	}

	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping(value = "/insertByList", method = RequestMethod.POST)
	public String insertByList(@RequestParam("excel") MultipartFile file, HttpServletRequest request)
			throws IOException {
		System.out.println("---------");
		String oldname = file.getOriginalFilename();
		if (!oldname.substring(oldname.indexOf('.')).equalsIgnoreCase(".xls")) {
			request.setAttribute("ret", 14);
			return "retprocess";
		}
		String result = ExcelProcess.criticismProcess(criticismService, file.getInputStream());
		request.setAttribute("ret", 15);
		request.setAttribute("result", result);
		return "retprocess";
	}

	@RequestMapping(value = "/deleteByCrid", method = RequestMethod.GET)
	public String deleteByCrid(@RequestParam("crid") long crid, HttpServletRequest request, HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		Criticism criticism = criticismService.selectByCrid(crid);
		Student student = studentService.getStudentBySno(criticism.getSno());
		if (t.getTfrom() != student.getTfrom()) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		int ret = criticismService.deleteByCrid(crid);
		if (ret != 0)
			request.setAttribute("ret", 12);
		else
			request.setAttribute("ret", 13);
		return "retprocess";
	}

	@RequestMapping("/selectByTno")
	public String selectByTno(HttpServletRequest request, HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		List<Criticism> criticismlist = criticismService.selectByTno(t.getTfrom());
		request.setAttribute("criticismlist", criticismlist);
		return "teacher_criticismmanager";
	}
}
