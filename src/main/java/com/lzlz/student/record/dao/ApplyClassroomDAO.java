package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.ApplyClassroom;

@Repository
public interface ApplyClassroomDAO {
	public List<ApplyClassroom> selectByToday();

	public int insertByApplyClassroom(@Param("applyClassroom") ApplyClassroom applyClassroom);
}
