package com.lzlz.student.record.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzlz.student.record.entiy.Activity;
import com.lzlz.student.record.entiy.Student;
import com.lzlz.student.record.service.ActivityService;

@Controller
@RequestMapping("/Activity")
public class ActivityController {
	private ActivityService activityService;

	@Autowired
	public void setActivityService(ActivityService activityService) {
		this.activityService = activityService;
	}

	@RequestMapping(value = "/insertByStudent", method = RequestMethod.POST)
	public String insertByActivity(Activity activity, HttpServletRequest request, HttpSession session) {
		activity.setProposer(((Student) session.getAttribute("student")).getSno());
		activity.setAstate("未通过");
		int ret = activityService.insertByActivity(activity);
		if (ret != 0)
			request.setAttribute("ret", 7);
		else
			request.setAttribute("ret", 8);
		return "retprocess.jsp";
	}

	@RequestMapping("/selectByAid")
	public @ResponseBody Activity selectByAid() {
		return activityService.selectByAid(2);
	}

	@RequestMapping("/selectAllByNoPass")
	public @ResponseBody List<Activity> selectAllByNoPass() {
		return activityService.selectAllByNoPass();
	}

	@RequestMapping("/selectAllByProposer")
	public @ResponseBody List<Activity> selectAllByProposer() {
		return activityService.selectAllByProposer(201615230142L);
	}

	@RequestMapping("/updateByTeacher")
	public String updateByActivity(Activity activity, HttpServletRequest request) {
		activity.setAstate("已通过");
		int ret = activityService.updateByActivity(activity);
		if (ret != 0)
			request.setAttribute("ret", 4);
		else
			request.setAttribute("ret", 5);
		return "retprocess";
	}

	@RequestMapping("/deleteByAid")
	public @ResponseBody int deleteByAid() {
		return activityService.deleteByAid(1);
	}
}
