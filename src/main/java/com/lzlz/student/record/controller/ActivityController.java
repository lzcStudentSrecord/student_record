package com.lzlz.student.record.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzlz.student.record.entiy.Activity;
import com.lzlz.student.record.service.ActivityService;

@Controller
@RequestMapping("/Activity")
public class ActivityController {
	private ActivityService activityService;

	@Autowired
	public void setActivityService(ActivityService activityService) {
		this.activityService = activityService;
	}

	@RequestMapping("/insertByActivity")
	public @ResponseBody int insertByActivity() {
		return activityService.insertByActivity(new Activity(0, 201615230142L, "洛天依全息演唱会", "举办演唱会", "天依殿下我爱你", "未通过"));
	}

	@RequestMapping("/selectByAid")
	public @ResponseBody Activity selectByAid(){
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

	@RequestMapping("/updateByActivity")
	public @ResponseBody int updateByActivity() {
		return activityService.updateByActivity(new Activity(1, 201615230142L, "洛天依全息演唱会", "举办演唱会", "天依殿下我爱你", "未通过"));
	}

	@RequestMapping("/deleteByAid")
	public @ResponseBody int deleteByAid() {
		return activityService.deleteByAid(1);
	}
}
