package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.ApplyClassroom;

@Repository
public interface ApplyClassroomDAO {
	/**
	 * 查询当天所申请的教室信息
	 * @return 数据集合
	 */
	public List<ApplyClassroom> selectByToday();

	/**
	 * 通过ApplyClassroom添加一条数据
	 * @param applyClassroom 关系映射的对象
	 * @return 结果码
	 */
	public int insertByApplyClassroom(@Param("applyClassroom") ApplyClassroom applyClassroom);
}
