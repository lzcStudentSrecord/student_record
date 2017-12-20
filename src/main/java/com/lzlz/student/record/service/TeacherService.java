package com.lzlz.student.record.service;

import org.springframework.stereotype.Service;

import com.lzlz.student.record.entiy.Teacher;

@Service
public interface TeacherService {
	public int insertByTeacher(Teacher teacher);

	public Teacher selectByTno(long tno);
	
	public int updateByTeacher(Teacher teacher);
	
	public int deleteByTno(long tno);
}
