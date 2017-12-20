package com.lzlz.student.record.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.ApplyClassroomDAO;
import com.lzlz.student.record.entiy.ApplyClassroom;
import com.lzlz.student.record.service.ApplyClassroomService;

@Service("applyClassroomService")
public class ApplyClassroomServiceImpl implements ApplyClassroomService{
	private ApplyClassroomDAO applyClassroomDAO;

	@Autowired
	public void setApplyClassroomDAO(ApplyClassroomDAO applyClassroomDAO) {
		this.applyClassroomDAO = applyClassroomDAO;
	}

	@Override
	public List<ApplyClassroom> selectByToday() {
		return applyClassroomDAO.selectByToday();
	}

	@Override
	public int insertByApplyClassroom(ApplyClassroom applyClassroom) {
		return applyClassroomDAO.insertByApplyClassroom(applyClassroom);
	}

}
