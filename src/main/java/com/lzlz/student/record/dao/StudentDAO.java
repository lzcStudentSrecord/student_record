package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.Student;

@Repository
public interface StudentDAO {
	public int insertByList(@Param("list") List<Student> list);

	public List<Long> getAllId();
	
	public List<Student> selectAll();
	
	public int updateByStudent(@Param("student") Student student);

	public Student getStudentBySno(@Param("sno") long sno);

	public int deleteBySno(@Param("sno") long sno);

	public int insertByStudent(@Param("student") Student student);
}
