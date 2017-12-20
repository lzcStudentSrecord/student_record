package com.lzlz.student.record.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.entiy.ApplyClassroom;

@Service
public interface ApplyClassroomService {
	public List<ApplyClassroom> selectByToday();

	public int insertByApplyClassroom(ApplyClassroom applyClassroom);
}
