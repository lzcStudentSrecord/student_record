package com.lzlz.student.record.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.StudentDAO;
import com.lzlz.student.record.service.StudentTextbookService;

@Service("studentTextbookService")
public class StudentTextbookServiceImpl implements StudentTextbookService{
	private StudentDAO studentDAO;

	@Autowired
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

}
