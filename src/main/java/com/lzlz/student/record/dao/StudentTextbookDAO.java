package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.StudentTextbook;

@Repository
public interface StudentTextbookDAO {
	/**
	 * 通过StudentTextbook添加一条数据
	 * 
	 * @param studentTextbook
	 *            关系映射的对象
	 * @return 结果码
	 */
	public int insertByStudentTextbook(@Param("studentTextbook") StudentTextbook studentTextbook);

	/**
	 * 通过集合添加多条数据
	 * 
	 * @param list
	 *            集合
	 * @return 结果码(select LAST_INSERT())
	 */
	public int insertByList(@Param("list") List<StudentTextbook> list);

	/**
	 * 通过记录编号删除一条数据
	 * 
	 * @param stno
	 *            教材选择id
	 * @return
	 */
	public int deleteByStno(@Param("stno") long stno);

	/**
	 * 通过教材选择表的id来修改教材选择表的状态
	 * 
	 * @param stno
	 *            教材选择id
	 * @return 结果码
	 */
	public int updateByStno(@Param("stno") long stno);

	/**
	 * 通过学号查询未确认的教材选择数据
	 * 
	 * @param sno
	 *            学号
	 * @return 数据集合
	 */
	public List<StudentTextbook> selectBySnoWithNoPass(@Param("sno") long sno);

	/**
	 * 通过老师查询未确认的教材选择数据
	 * 
	 * @param sno
	 *            学号
	 * @return 数据集合
	 */
	public List<StudentTextbook> selectByTno(@Param("tno") long tno);

	/**
	 * 通过编号查询一条信息
	 * 
	 * @param stno
	 * @return
	 */
	public StudentTextbook selectStudentTextbookByStno(@Param("stno") long stno);

}
