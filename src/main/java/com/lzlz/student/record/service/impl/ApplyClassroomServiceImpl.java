package com.lzlz.student.record.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.ApplyClassroomDAO;
import com.lzlz.student.record.entiy.ApplyClassroom;
import com.lzlz.student.record.service.ApplyClassroomService;

@Service("applyClassroomService")
public class ApplyClassroomServiceImpl implements ApplyClassroomService {
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

	@Override
	public List<ApplyClassroom> selectByTno(long tno) {
		return applyClassroomDAO.selectByTno(tno);
	}

	@Override
	public ApplyClassroom selectByAcid(long acid) {
		return applyClassroomDAO.selectByAcid(acid);
	}

	@Override
	public int updateByAcid(long acid) {
		return applyClassroomDAO.updateByAcid(acid);
	}

	@Override
	public List<ApplyClassroom> selectBySno(long sno) {
		return applyClassroomDAO.selectBySno(sno);
	}

	@Override
	public int deleteByAcid(long acid) {
		return applyClassroomDAO.deleteByAcid(acid);
	}

}
