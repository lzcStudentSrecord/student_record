package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy._Class;

@Repository
public interface _ClassDAO {
	/**
	 * 通过_Class对象添加一条数据(暂时不用)
	 * 
	 * @param _class
	 *            数据关系映射的对象
	 * @return 成功个数
	 */
	public int insertBy_Class(@Param("_class") _Class _class);

	/**
	 * 通过班级编号查询数据并封装到_Class对象中(暂时不用)
	 * 
	 * @param c_no
	 *            班级编号
	 * @return 数据关系映射的对象
	 */
	public _Class selectByC_no(@Param("c_no") long c_no);

	/**
	 * 查询所有的数据并且封装到集合中
	 * 
	 * @return 所有数据的集合
	 */
	public List<_Class> selectAll();

	/**
	 * 通过_Class对象修改一条数据(暂时不用)
	 * 
	 * @param _class
	 *            数据关系映射的对象
	 * @return 修改数据的个数
	 */
	public int updateBy_Class(@Param("_class") _Class _class);

	/**
	 * 通过班级编号删除一条数据(暂时不用)
	 * 
	 * @param c_no
	 *            班级编号
	 * @return 删除的个数
	 */
	public int deleteByC_no(@Param("c_no") long c_no);
}
