package com.lzlz.student.record.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lzlz.student.record.entiy.AdjustLesson;
import com.lzlz.student.record.entiy.Teacher;
import com.lzlz.student.record.service.AdjustLessonService;

@Controller
@RequestMapping("/AdjustLesson")
public class AdjustLessonController {
	private AdjustLessonService adjustLessonService;

	@Autowired
	public void setAdjustLessonService(AdjustLessonService adjustLessonService) {
		this.adjustLessonService = adjustLessonService;
	}

	@RequestMapping(value = "/insertByTeacher", method = RequestMethod.POST)
	public String insertByAdjustLesson(AdjustLesson adjustLesson, HttpServletRequest request, HttpSession session) {
		adjustLesson.setTno(((Teacher) session.getAttribute("teacher")).getTno());
		int ret = adjustLessonService.insertByAdjustLesson(adjustLesson);
		if (ret != 0)
			request.setAttribute("ret", 6);
		else
			request.setAttribute("ret", 7);
		return "retprocess";
	}

	@RequestMapping(value = "/selectByAlno", method = RequestMethod.GET)
	public String selectByAlno(@RequestParam("alno") long alno, HttpServletRequest request) {
		AdjustLesson adjustLesson = adjustLessonService.selectByAlno(alno);
		request.setAttribute("adjustinfo", adjustLesson);
		return "adjustinfo";
	}
}
