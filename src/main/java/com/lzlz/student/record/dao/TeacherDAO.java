package com.lzlz.student.record.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.Teacher;

@Repository
public interface TeacherDAO {
	/**
	 * 通过Teacher添加一条数据
	 * 
	 * @param teacher
	 *            关系映射的对象
	 * @return 结果码
	 */
	public int insertByTeacher(@Param("teacher") Teacher teacher);

	/**
	 * 通过老师编号查询数据并封装到老师对象中
	 * 
	 * @param tno
	 *            老师编号
	 * @return 数据关系映射的对象
	 */
	public Teacher selectByTno(@Param("tno") long tno);

	/**
	 * 通过Teacher对象修改数据
	 * 
	 * @param teacher
	 *            关系映射的对象
	 * @return 结果码
	 */
	public int updateByTeacher(@Param("teacher") Teacher teacher);

	/**
	 * 通过老师编号删除一条数据
	 * 
	 * @param tno
	 * @return 结果码
	 */
	public int deleteByTno(@Param("tno") long tno);
}
