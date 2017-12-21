package com.lzlz.student.record.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.StudentTextbookDAO;
import com.lzlz.student.record.entiy.StudentTextbook;
import com.lzlz.student.record.service.StudentTextbookService;

@Service("studentTextbookService")
public class StudentTextbookServiceImpl implements StudentTextbookService {

	private StudentTextbookDAO studentTextbookDAO;

	@Autowired
	public void setStudentTextbookDAO(StudentTextbookDAO studentTextbookDAO) {
		this.studentTextbookDAO = studentTextbookDAO;
	}

	@Override
	public int insertByStudentTextbook(StudentTextbook studentTextbook) {
		return studentTextbookDAO.insertByStudentTextbook(studentTextbook);
	}

	@Override
	public int insertByList(List<StudentTextbook> list) {
		return studentTextbookDAO.insertByList(list);
	}

	@Override
	public List<StudentTextbook> selectBySnoWithNoPass(long sno) {
		return studentTextbookDAO.selectBySnoWithNoPass(sno);
	}

	@Override
	public List<StudentTextbook> selectByTnoWithNoPass(long tno) {
		return studentTextbookDAO.selectByTnoWithNoPass(tno);
	}

	@Override
	public int updateByStno(long stno) {
		return studentTextbookDAO.updateByStno(stno);
	}

}
