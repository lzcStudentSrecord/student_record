package com.lzlz.student.record.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.lzlz.student.record.entiy.Credit;
import com.lzlz.student.record.entiy.Student;
import com.lzlz.student.record.entiy.Teacher;
import com.lzlz.student.record.service.CreditService;
import com.lzlz.student.record.service.StudentService;
import com.lzlz.student.record.util.ExcelProcess;

@Controller
@RequestMapping("/Credit")
public class CreditController {
	private CreditService creditService;
	private StudentService studentService;

	@Autowired
	public void setCreditService(CreditService creditService) {
		this.creditService = creditService;
	}

	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping(value = "/insertByStudent", method = RequestMethod.POST, produces = { "text/html;charset=UTF-8" })
	public @ResponseBody String insertByCredit(Credit credit, HttpServletRequest request, HttpSession session) {
		JSONArray array = new JSONArray();
		for (Student student : studentService.selectAllByTno(1)) {
			System.out.println("");
			JSONObject jsonObject = new JSONObject(student);
			array.put(jsonObject);
		}
		return array.toString();
	}

	@RequestMapping(value = "/getCreditByCredId", method = RequestMethod.GET)
	public String getCreditByCredId(@RequestParam("CredId") long credId, HttpServletRequest request,
			HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		Credit credit = creditService.selectByCredId(credId);
		request.setAttribute("updatecredit", credit);
		return "teacher_creditupdate";
	}

	@RequestMapping(value = "/insertByList", method = RequestMethod.POST)
	public String insertByList(@RequestParam("excel") MultipartFile file, HttpServletRequest request)
			throws IOException {
		String oldname = file.getOriginalFilename();
		if (!oldname.substring(oldname.indexOf('.')).equalsIgnoreCase(".xls")) {
			request.setAttribute("ret", 14);
			return "retprocess";
		}
		String result = ExcelProcess.creditProcess(creditService, file.getInputStream());
		request.setAttribute("ret", 15);
		request.setAttribute("result", result);
		return "retprocess";
	}

	@RequestMapping(value = "/updateByCredit", method = RequestMethod.POST)
	public String updateByCredit(Credit credit, HttpServletRequest request, HttpSession session) {
		int ret = creditService.updateByCredit(credit);
		if (ret != 0)
			request.setAttribute("ret", 4);
		else
			request.setAttribute("ret", 5);
		return "retprocess";
	}

	@RequestMapping(value = "/deleteByCredId", method = RequestMethod.GET)
	public String deleteByCredId(@RequestParam("credId") long credId, HttpServletRequest request, HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		Credit credit = creditService.selectByCredId(credId);
		Student stu = studentService.getStudentBySno(credit.getSno());
		if (stu == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		if (stu.getTfrom() != t.getTfrom()) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		int ret = creditService.deleteByCredId(credId);
		if (ret != 0)
			request.setAttribute("ret", 12);
		else
			request.setAttribute("ret", 13);
		return "retprocess";
	}

	@RequestMapping(value = "/selectByTno", method = RequestMethod.GET)
	public String selectByTno(HttpServletRequest request, HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		List<Credit> list = creditService.selectByTno(t.getTfrom());
		request.setAttribute("creditlist", list);
		return "teacher_creditmanager";
	}
}
