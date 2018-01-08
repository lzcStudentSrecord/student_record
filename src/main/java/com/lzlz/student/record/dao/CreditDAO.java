package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.Credit;

@Repository
public interface CreditDAO {
	/**
	 * 通过Credit添加一条数据
	 * 
	 * @param credit
	 *            关系映射的对象
	 * @return 结果码
	 */
	public int insertByCredit(@Param("credit") Credit credit);

	/**
	 * 通过集合添加多条数据
	 * 
	 * @param list
	 *            集合
	 * @return 结果码(select LAST_INSERT())
	 */
	public int insertByList(@Param("list") List<Credit> list);

	/**
	 * 通过Credit对象修改数据(暂时不用)
	 * 
	 * @param credit
	 *            关系映射的对象
	 * @return 结果码
	 */
	public int updateByCredit(@Param("credit") Credit credit);

	/**
	 * 通过学分编号删除一条数据
	 * 
	 * @param credId
	 *            学分编号
	 * @return 删除的个数
	 */
	public int deleteByCredId(@Param("credId") long credId);

	/**
	 * 通过老师编号查询所有的数据
	 * 
	 * @param tno
	 *            老师编号
	 * @return 数据集合
	 */
	public List<Credit> selectByTno(@Param("tno") long tno);

	/**
	 * 通过学分编号查询一条数据(暂时不用)
	 * 
	 * @param credId
	 *            学分编号
	 * @return 删除的个数
	 */
	public Credit selectByCredId(@Param("credId") long credId);
}
