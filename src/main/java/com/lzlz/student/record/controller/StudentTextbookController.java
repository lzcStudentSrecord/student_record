package com.lzlz.student.record.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

	@RequestMapping("/insertByStudentTextbook")
	public @ResponseBody int insertByStudentTextbook() {
		return studentTextbookService
				.insertByStudentTextbook(new StudentTextbook(0, 201615230142L, "如何去二次元", 1, 998.0f, null));
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

	@RequestMapping("/updateByStno")
	public @ResponseBody int updateByStno() {
		return studentTextbookService.updateByStno(2);
	}

	@RequestMapping("/selectByTnoWithNoPass")
	public @ResponseBody List<StudentTextbook> selectByTnoWithNoPass() {
		return studentTextbookService.selectByTnoWithNoPass(9901);
	}
}
