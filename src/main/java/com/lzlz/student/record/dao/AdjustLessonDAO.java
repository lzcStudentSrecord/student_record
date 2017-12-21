package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.AdjustLesson;

@Repository
public interface AdjustLessonDAO {
	/**
	 * 通过AdjustLesson添加一条数据
	 * @param adjustLesson 关系映射对象
	 * @return 成功码
	 */
	public int insertByAdjustLesson(@Param("adjustLesson") AdjustLesson adjustLesson);
	/**
	 * 通过学号查询所有数据
	 * @param sno 学号主键
	 * @return 返回所有数据集合
	 */
	public List<AdjustLesson> selectAllBySno(@Param("sno") long sno);
}
