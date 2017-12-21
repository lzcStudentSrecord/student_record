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
	 * 查询所有的主题帖
	 * 
	 * @return 数据集合
	 */
	public List<Posts> selectAll();
}
