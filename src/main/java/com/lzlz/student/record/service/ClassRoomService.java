package com.lzlz.student.record.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lzlz.student.record.entiy.ClassRoom;

@Service
public interface ClassRoomService {
	public int insertByClassRoom(ClassRoom classRoom);

	public int updateByClassRoom(ClassRoom classRoom);
	
	public List<ClassRoom> selectAll();
}
