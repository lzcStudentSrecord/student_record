package com.lzlz.student.record.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lzlz.student.record.entiy.ApplyClassroom;

@Service
public interface ApplyClassroomService {
	public List<ApplyClassroom> selectByToday();

	public int insertByApplyClassroom(ApplyClassroom applyClassroom);

	public List<ApplyClassroom> selectByTno(long tno);

	public List<ApplyClassroom> selectBySno(long sno);

	public ApplyClassroom selectByAcid(long acid);

	public int updateByAcid(long acid);
	
	public int deleteByAcid(long acid);
}
