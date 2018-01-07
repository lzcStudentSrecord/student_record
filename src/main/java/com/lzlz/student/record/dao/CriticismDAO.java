package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.Criticism;

@Repository
public interface CriticismDAO {
	/**
	 * 通过Criticism添加一条数据
	 * 
	 * @param criticism
	 *            关系映射的对象
	 * @return 结果码
	 */
	public int insertByCriticism(@Param("criticism") Criticism criticism);

	/**
	 * 通过集合添加多条数据
	 * 
	 * @param list
	 *            集合
	 * @return 结果码(select LAST_INSERT())
	 */
	public int insertByList(@Param("list") List<Criticism> list);

	/**
	 * 通过Criticism对象修改数据
	 * 
	 * @param criticism
	 *            关系映射的对象
	 * @return 结果码
	 */
	public int updateByCriticism(@Param("criticism") Criticism criticism);

	/**
	 * 通过通报批评的编号删除一条数据
	 * 
	 * @param crid
	 *            通报批评的编号
	 * @return 删除的个数
	 */
	public int deleteByCrid(@Param("crid") long crid);

	/**
	 * 通过老师编号查询所有的数据
	 * 
	 * @param tno
	 *            老师编号
	 * @return 数据集合
	 */
	public List<Criticism> selectByTno(@Param("tno") long tno);

	/**
	 * 通过记录编号查询一条记录
	 * 
	 * @param crid
	 *            记录编号
	 * @return
	 */
	public Criticism selectByCrid(@Param("crid") long crid);
}
