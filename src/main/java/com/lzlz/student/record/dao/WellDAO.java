package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.Well;

@Repository
public interface WellDAO {
	/**
	 * 通过Well添加一条数据
	 * 
	 * @param well
	 *            关系映射的对象
	 * @return 结果码
	 */
	public int insertByWell(@Param("well") Well well);

	/**
	 * 通过集合添加多条数据
	 * 
	 * @param list
	 *            集合
	 * @return 结果码(select LAST_INSERT())
	 */
	public int insertByList(@Param("list") List<Well> list);

	/**
	 * 通过学号查询数据
	 * 
	 * @param sno
	 *            学号
	 * @return 数据集合
	 */
	public List<Well> selectBySno(@Param("sno") long sno);

	/**
	 * 通过老师编号查询数据
	 * 
	 * @param tno
	 *            老师编号
	 * @return 数据集合
	 */
	public List<Well> selectByTno(@Param("tno") long tno);

	/**
	 * 通过编号删除数据
	 * 
	 * @param weid
	 *            编号
	 * @return
	 */
	public int deleteByWeid(@Param("weid") long weid);
}
