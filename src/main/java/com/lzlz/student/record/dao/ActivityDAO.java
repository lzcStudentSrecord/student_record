package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.Activity;

@Repository
public interface ActivityDAO {
	/**
	 * 通过Activity插入一条数据
	 * 
	 * @param activity
	 *            需要插入数据的对象映射
	 * @return 插入成功的个数
	 */
	public int insertByActivity(@Param("activity") Activity activity);

	/**
	 * 通过活动编号查询一条数据并且封装成Activity对象
	 * 
	 * @param aid
	 *            活动编号
	 * @return 关系映射的对象
	 */
	public Activity selectByAid(@Param("aid") long aid);

	/**
	 * 查询所有未被通过的数据
	 * 
	 * @return 所有未被通过的数据集合
	 */
	public List<Activity> selectAllByNoPass();

	/**
	 * 通过申请人查询数据
	 * 
	 * @param sno
	 *            申请人的ID（学生）
	 * @return 所有数据的集合
	 */
	public List<Activity> selectAllByProposer(@Param("sno") long sno);

	/**
	 * 通过Activity修改一条数据
	 * 
	 * @param activity
	 *            修改数据的对象映射
	 * @return 修改的个数
	 */
	public int updateByActivity(@Param("activity") Activity activity);

	/**
	 * 通过活动编号删除一条数据(未通过的活动)
	 * 
	 * @param aid
	 *            活动编号
	 * @return 删除的个数
	 */
	public int deleteByAid(@Param("aid") long aid);
}
