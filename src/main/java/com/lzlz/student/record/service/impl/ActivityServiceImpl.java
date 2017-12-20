package com.lzlz.student.record.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.ActivityDAO;
import com.lzlz.student.record.entiy.Activity;
import com.lzlz.student.record.service.ActivityService;

@Service("activityService")
public class ActivityServiceImpl implements ActivityService {
	private ActivityDAO activityDAO;

	@Autowired
	public void setActivityDAO(ActivityDAO activityDAO) {
		this.activityDAO = activityDAO;
	}

	@Override
	public int insertByActivity(Activity activity) {
		return activityDAO.insertByActivity(activity);
	}

	@Override
	public List<Activity> selectAllByNoPass() {
		return activityDAO.selectAllByNoPass();
	}

	@Override
	public List<Activity> selectAllByProposer(long sno) {
		return activityDAO.selectAllByProposer(sno);
	}

	@Override
	public int updateByActivity(Activity activity) {
		return activityDAO.updateByActivity(activity);
	}

	@Override
	public int deleteByAid(long aid) {
		return activityDAO.deleteByAid(aid);
	}

	@Override
	public Activity selectByAid(long aid) {
		return activityDAO.selectByAid(aid);
	}

}
