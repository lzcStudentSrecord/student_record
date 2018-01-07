package com.lzlz.student.record.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lzlz.student.record.entiy.StudentTextbook;

@Service
public interface StudentTextbookService {
	public int insertByStudentTextbook(StudentTextbook studentTextbook);

	public int insertByList(List<StudentTextbook> list);
	
	public int updateByStno(long stno);

	public int deleteByStno(long stno);
	
	public List<StudentTextbook> selectBySnoWithNoPass(long sno);
	
	public List<StudentTextbook> selectByTno(long tno);
	
	public StudentTextbook selectStudentTextbookByStno(long stno);
}
