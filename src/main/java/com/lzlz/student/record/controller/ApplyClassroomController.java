package com.lzlz.student.record.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzlz.student.record.entiy.ApplyClassroom;
import com.lzlz.student.record.entiy.Student;
import com.lzlz.student.record.entiy.Teacher;
import com.lzlz.student.record.service.ApplyClassroomService;

@Controller
@RequestMapping("/ApplyClassroom")
public class ApplyClassroomController {
	private ApplyClassroomService applyClassroomService;

	@Autowired
	public void setApplyClassroomService(ApplyClassroomService applyClassroomService) {
		this.applyClassroomService = applyClassroomService;
	}

	@RequestMapping(value = "insertByStudent", method = RequestMethod.POST)
	public @ResponseBody int insertByStudent(ApplyClassroom applyClassroom, HttpServletRequest request,
			HttpSession session) {
		applyClassroom.setAcstate("未通过");
		applyClassroom.setProposer(((Student) session.getAttribute("student")).getSno());
		return applyClassroomService.insertByApplyClassroom(applyClassroom);
	}

	@RequestMapping(value = "insertByTeacher", method = RequestMethod.POST)
	public @ResponseBody int insertByTeacher(ApplyClassroom applyClassroom, HttpServletRequest request,
			HttpSession session) {
		applyClassroom.setProposer(((Teacher) session.getAttribute("Teacher")).getTno());
		applyClassroom.setAcstate("已通过");
		return applyClassroomService.insertByApplyClassroom(applyClassroom);
	}

	@RequestMapping(value = "selectByToday", method = RequestMethod.GET)
	public @ResponseBody List<ApplyClassroom> selectByToday() {
		return applyClassroomService.selectByToday();
	}
}
