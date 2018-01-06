package com.lzlz.student.record.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzlz.student.record.entiy.StudentTextbook;
import com.lzlz.student.record.service.StudentTextbookService;

@Controller
@RequestMapping("/StudentTextbook")
public class StudentTextbookController {
	private StudentTextbookService studentTextbookService;

	@Autowired
	public void setStudentTextbookService(StudentTextbookService studentTextbookService) {
		this.studentTextbookService = studentTextbookService;
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

	@RequestMapping("/insertByList")
	public @ResponseBody int insertByList() {
		List<StudentTextbook> list = new ArrayList<>();
		list.add(new StudentTextbook(0, 201615230142L, "如何去二次元", 1, 998.0f, null));
		return studentTextbookService.insertByList(list);
	}

	@RequestMapping("/selectBySnoWithNoPass")
	public @ResponseBody List<StudentTextbook> selectBySnoWithNoPass() {
		return studentTextbookService.selectBySnoWithNoPass(201615230142L);
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

	@RequestMapping("/selectByTnoWithNoPass")
	public @ResponseBody List<StudentTextbook> selectByTnoWithNoPass() {
		return studentTextbookService.selectByTnoWithNoPass(9901);
	}
}
