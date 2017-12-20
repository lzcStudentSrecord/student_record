package com.lzlz.student.record.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.entiy.Activity;

@Service
public interface ActivityService {
	public int insertByActivity(Activity activity);
	
	public Activity selectByAid(@Param("aid") long aid);

	public List<Activity> selectAllByNoPass();
	
	public List<Activity> selectAllByProposer(long sno);
	
	public int updateByActivity(Activity activity);
	
	public int deleteByAid(long aid);
}
