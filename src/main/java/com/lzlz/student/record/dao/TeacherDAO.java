package com.lzlz.student.record.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.Teacher;

@Repository
public interface TeacherDAO {
	public int insertByTeacher(@Param("teacher") Teacher teacher);

	public Teacher selectByTno(@Param("tno") long tno);

	public int updateByTeacher(@Param("teacher") Teacher teacher);

	public int deleteByTno(@Param("tno") long tno);
}
