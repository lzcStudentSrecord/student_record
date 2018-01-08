package com.lzlz.student.record.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lzlz.student.record.entiy.AdjustLesson;

@Service
public interface AdjustLessonService {
	public int insertByAdjustLesson(AdjustLesson adjustLesson);

	public AdjustLesson selectByAlno(long alno);
	
	public List<AdjustLesson> selectAllBySno(long sno);

	public List<AdjustLesson> selectAll();
}
