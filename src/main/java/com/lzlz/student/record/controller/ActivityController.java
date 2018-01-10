package com.lzlz.student.record.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzlz.student.record.entiy.Activity;
import com.lzlz.student.record.entiy.Student;
import com.lzlz.student.record.entiy.Teacher;
import com.lzlz.student.record.service.ActivityService;
import com.lzlz.student.record.service.StudentService;

@Controller
@RequestMapping("/Activity")
public class ActivityController {
	private ActivityService activityService;
	private StudentService studentService;

	@Autowired
	public void setActivityService(ActivityService activityService) {
		this.activityService = activityService;
	}

	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping(value = "/insertByStudent", method = RequestMethod.POST)
	public String insertByActivity(Activity activity, HttpServletRequest request, HttpSession session) {
		activity.setProposer(((Student) session.getAttribute("student")).getSno());
		activity.setAstate("未通过");
		int ret = activityService.insertByActivity(activity);
		if (ret != 0)
			request.setAttribute("ret", 6);
		else
			request.setAttribute("ret", 7);
		return "retprocess";
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

	@RequestMapping(value = "/selectByTno", method = RequestMethod.GET)
	public String selectByTno(HttpServletRequest request, HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		List<Activity> activitylist = activityService.selectByTno(t.getTfrom());
		request.setAttribute("activitylist", activitylist);
		return "teacher_activitymanager";
	}

	@RequestMapping(value = "/selectByAid", method = RequestMethod.GET)
	public String selectByAid(@RequestParam("aid") long aid, HttpServletRequest request, HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		Activity activity = activityService.selectByAid(aid);
		Student student = studentService.getStudentBySno(activity.getProposer());
		if (student.getTfrom() != t.getTfrom()) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		request.setAttribute("activityupdate", activity);
		return "teacher_activity";
	}

	@RequestMapping("/deleteByAid")
	public @ResponseBody int deleteByAid() {
		return activityService.deleteByAid(1);
	}
}
