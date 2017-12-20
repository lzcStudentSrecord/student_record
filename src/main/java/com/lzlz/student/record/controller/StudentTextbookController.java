package com.lzlz.student.record.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lzlz.student.record.service.StudentTextbookService;

@Controller
@RequestMapping("/StudentTextbook")
public class StudentTextbookController {
	private StudentTextbookService studentTextbookService;

	@Autowired
	public void setStudentTextbookService(StudentTextbookService studentTextbookService) {
		this.studentTextbookService = studentTextbookService;
	}

}
