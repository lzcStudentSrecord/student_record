package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.Student;

@Repository
public interface StudentDAO {

	/**
	 * 通过集合添加多条数据
	 * 
	 * @param list
	 *            集合
	 * @return 结果码(select LAST_INSERT())
	 */
	public int insertByList(@Param("list") List<Student> list);

	/**
	 * 查询所有学生的编号
	 * 
	 * @return 所有学生编号的集合
	 */
	public List<Long> getAllId();

	/**
	 * 通过老师编号查询学生
	 * 
	 * @return 所有学生对线的集合
	 */
	public List<Student> selectAllByTno(@Param("tno") long tno);

	/**
	 * 通过Student对象修改数据
	 * 
	 * @param student
	 *            关系映射的对象
	 * @return 结果码
	 */
	public int updateByStudent(@Param("student") Student student);

	/**
	 * 通过学生编号查询数据并封装到学生对象中
	 * 
	 * @param sno
	 *            学生编号
	 * @return 数据关系映射的对象
	 */
	public Student getStudentBySno(@Param("sno") long sno);

	/**
	 * 通过学生编号删除一条数据
	 * 
	 * @param sno
	 *            学生编号
	 * @return 删除的个数
	 */
	public int deleteBySno(@Param("sno") long sno);

	/**
	 * 通过Student添加一条数据(暂时不用)
	 * 
	 * @param student
	 *            关系映射的对象
	 * @return 结果码
	 */
	public int insertByStudent(@Param("student") Student student);
}
