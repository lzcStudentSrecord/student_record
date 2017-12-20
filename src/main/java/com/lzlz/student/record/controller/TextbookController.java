package com.lzlz.student.record.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lzlz.student.record.service.TextbookService;

@Controller
@RequestMapping("/Textbook")
public class TextbookController {
	private TextbookService textbookService;

	@Autowired
	public void setTextbookService(TextbookService textbookService) {
		this.textbookService = textbookService;
	}

}
