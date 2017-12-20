package com.lzlz.student.record.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzlz.student.record.entiy.ClassRoom;
import com.lzlz.student.record.service.ClassRoomService;

@Controller
@RequestMapping("/ClassRoom")
public class ClassRoomController {
	private ClassRoomService classRoomService;

	@Autowired
	public void setClassRoomService(ClassRoomService classRoomService) {
		this.classRoomService = classRoomService;
	}

	@RequestMapping("/insertByClassRoom")
	public @ResponseBody int insertByClassRoom() {
		return classRoomService.insertByClassRoom(new ClassRoom(1, "三次元"));
	}

	@RequestMapping("/updateByClassRoom")
	public @ResponseBody int updateByClassRoom() {
		return classRoomService.updateByClassRoom(new ClassRoom(1, "二次元"));
	}

	@RequestMapping("/selectAll")
	public @ResponseBody List<ClassRoom> selectAll() {
		return classRoomService.selectAll();
	}
}
