package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.ApplyClassroom;

@Repository
public interface ApplyClassroomDAO {
	/**
	 * 查询当天所申请的教室信息
	 * 
	 * @return 数据集合
	 */
	public List<ApplyClassroom> selectByToday();

	/**
	 * 通过ApplyClassroom添加一条数据
	 * 
	 * @param applyClassroom
	 *            关系映射的对象
	 * @return 结果码
	 */
	public int insertByApplyClassroom(@Param("applyClassroom") ApplyClassroom applyClassroom);

	/**
	 * 通过老师的所在班级查询所有的教室申请
	 * 
	 * @param tno
	 *            老师的班级编号
	 * @return
	 */
	public List<ApplyClassroom> selectByTno(@Param("tno") long tno);

	/**
	 * 通过记录编号查询一条记录
	 * 
	 * @param acid
	 *            记录编号
	 * @return
	 */
	public ApplyClassroom selectByAcid(@Param("acid") long acid);

	/**
	 * 通过记录编号修改状态为通过
	 * 
	 * @param acid
	 *            记录编号
	 * @return
	 */
	public int updateByAcid(@Param("acid") long acid);
}
