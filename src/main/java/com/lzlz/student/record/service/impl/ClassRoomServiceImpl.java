package com.lzlz.student.record.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.ClassRoomDAO;
import com.lzlz.student.record.entiy.ClassRoom;
import com.lzlz.student.record.service.ClassRoomService;

@Service("classRoomService")
public class ClassRoomServiceImpl implements ClassRoomService {
	private ClassRoomDAO classRoomDAO;

	@Autowired
	public void setClassRoomDAO(ClassRoomDAO classRoomDAO) {
		this.classRoomDAO = classRoomDAO;
	}

	@Override
	public int insertByClassRoom(ClassRoom classRoom) {
		return classRoomDAO.insertByClassRoom(classRoom);
	}

	@Override
	public int updateByClassRoom(ClassRoom classRoom) {
		return classRoomDAO.updateByClassRoom(classRoom);
	}

	@Override
	public List<ClassRoom> selectAll() {
		return classRoomDAO.selectAll();
	}

}
