package com.lzlz.student.record.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

	@RequestMapping(value = "/selectAllBySno", method = RequestMethod.GET)
	public @ResponseBody List<AdjustLesson> selectAllBySno() {
		return adjustLessonService.selectAllBySno(9901);
	}
}
