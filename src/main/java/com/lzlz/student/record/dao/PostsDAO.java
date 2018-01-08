package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.Posts;

@Repository
public interface PostsDAO {
	/**
	 * 通过Posts添加一条数据
	 * 
	 * @param posts
	 *            关系映射的对象
	 * @return 结果码
	 */
	public int insertByPosts(@Param("posts") Posts posts);
	/**
	 * 查询所有的个数
	 * @return
	 */
	public int selectCount();
	/**
	 * 查询所有的主题帖
	 * 
	 * @return 数据集合
	 */
	public List<Posts> selectAll();
	/**
	 * 通过问题编号返回一条数据
	 * @param pid 问题编号
	 * @return
	 */
	public Posts selectByPid(@Param("pid")long pid);
	/**
	 * 分页查询
	 * @param first limit第一个参数
	 * @return
	 */
	public List<Posts> selectByFenYe(@Param("first") int first);
}
