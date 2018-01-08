package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.ClassRoom;

@Repository
public interface ClassRoomDAO {
	/**
	 * 通过ClassRoom添加一条数据(暂时不用)
	 * @param classRoom 关系映射的对象
	 * @return 结果码
	 */
	public int insertByClassRoom(@Param("classRoom") ClassRoom classRoom);
	/**
	 * 通过classRoom对象修改数据(暂时不用)
	 * 
	 * @param admin
	 *            关系映射的对象
	 * @return 结果码
	 */
	public int updateByClassRoom(@Param("classRoom") ClassRoom classRoom);
	/**
	 * 查询所有教室
	 * @return 数据集合
	 */
	public List<ClassRoom> selectAll();
}
