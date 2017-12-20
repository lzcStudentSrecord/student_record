package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.Activity;

@Repository
public interface ActivityDAO {
	public int insertByActivity(@Param("activity") Activity activity);

	public Activity selectByAid(@Param("aid") long aid);

	public List<Activity> selectAllByNoPass();

	public List<Activity> selectAllByProposer(@Param("sno") long sno);

	public int updateByActivity(@Param("activity") Activity activity);

	public int deleteByAid(@Param("aid") long aid);
}
