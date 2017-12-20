package com.lzlz.student.record.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzlz.student.record.entiy.ApplyClassroom;
import com.lzlz.student.record.service.ApplyClassroomService;

@Controller
@RequestMapping("/ApplyClassroom")
public class ApplyClassroomController {
	private ApplyClassroomService applyClassroomService;

	@Autowired
	public void setApplyClassroomService(ApplyClassroomService applyClassroomService) {
		this.applyClassroomService = applyClassroomService;
	}

	@RequestMapping(value = "insertByApplyClassroom", method = RequestMethod.GET)
	public @ResponseBody int insertByApplyClassroom() {
		return applyClassroomService.insertByApplyClassroom(
				new ApplyClassroom(9901, "不想上课", "二次元", "2017-12-18 21:15", "2017-12-18 23:15"));
	}

	@RequestMapping(value = "selectByToday", method = RequestMethod.GET)
	public @ResponseBody List<ApplyClassroom> selectByToday() {
		return applyClassroomService.selectByToday();
	}
}
