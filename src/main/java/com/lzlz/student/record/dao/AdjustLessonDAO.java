package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.AdjustLesson;

@Repository
public interface AdjustLessonDAO {
	public int insertByAdjustLesson(@Param("adjustLesson") AdjustLesson adjustLesson);
	public List<AdjustLesson> selectAllBySno(@Param("sno") long sno);
}
