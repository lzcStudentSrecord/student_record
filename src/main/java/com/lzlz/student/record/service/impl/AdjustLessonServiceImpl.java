package com.lzlz.student.record.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.AdjustLessonDAO;
import com.lzlz.student.record.entiy.AdjustLesson;
import com.lzlz.student.record.service.AdjustLessonService;

@Service("adjustLessonService")
public class AdjustLessonServiceImpl implements AdjustLessonService {
	private AdjustLessonDAO adjustLessonDAO;

	@Autowired
	public void setAdjustLessonDAO(AdjustLessonDAO adjustLessonDAO) {
		this.adjustLessonDAO = adjustLessonDAO;
	}

	@Override
	public int insertByAdjustLesson(AdjustLesson adjustLesson) {
		return adjustLessonDAO.insertByAdjustLesson(adjustLesson);
	}

	@Override
	public List<AdjustLesson> selectAllBySno(long sno) {
		return adjustLessonDAO.selectAllBySno(sno);
	}

}
