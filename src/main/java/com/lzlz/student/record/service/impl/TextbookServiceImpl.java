package com.lzlz.student.record.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.TextbookDAO;
import com.lzlz.student.record.service.TeacherService;
import com.lzlz.student.record.service.TextbookService;

@Service("textbookService")
public class TextbookServiceImpl implements TextbookService{
	private TextbookDAO textbookDAO;

	@Autowired
	public void setTextbookDAO(TextbookDAO textbookDAO) {
		this.textbookDAO = textbookDAO;
	}

}
