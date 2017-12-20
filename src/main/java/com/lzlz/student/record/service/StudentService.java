package com.lzlz.student.record.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lzlz.student.record.entiy.Student;

@Service
public interface StudentService {
	public int insertByList(List<Student> list);

	public List<Long> getAllId();
	
	public List<Student> selectAll();
	
	public int updateByStudent(Student student);
	
	public Student getStudentBySno(long sno);
	
	public int deleteBySno(long sno);
	
	public int insertByStudent(Student student);
}
