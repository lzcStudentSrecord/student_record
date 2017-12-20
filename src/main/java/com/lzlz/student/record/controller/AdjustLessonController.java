package com.lzlz.student.record.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzlz.student.record.entiy.AdjustLesson;
import com.lzlz.student.record.service.AdjustLessonService;

@Controller
@RequestMapping("/AdjustLesson")
public class AdjustLessonController {
	private AdjustLessonService adjustLessonService;

	@Autowired
	public void setAdjustLessonService(AdjustLessonService adjustLessonService) {
		this.adjustLessonService = adjustLessonService;
	}

	@RequestMapping(value = "/insertByAdjustLesson", method = RequestMethod.GET)
	public @ResponseBody int insertByAdjustLesson() {
		return adjustLessonService.insertByAdjustLesson(
				new AdjustLesson(9901, "不想上课", "java", "2017-12-19 上午1,2,3,4节课","三次元", "2017-12-21 上午1,2,3,4节课", "三次元"));
	}

	@RequestMapping(value = "/selectAllBySno", method = RequestMethod.GET)
	public @ResponseBody List<AdjustLesson> selectAllBySno() {
		return adjustLessonService.selectAllBySno(9901);
	}
}
