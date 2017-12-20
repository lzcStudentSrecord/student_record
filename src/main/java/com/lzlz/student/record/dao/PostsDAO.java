package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.Posts;

@Repository
public interface PostsDAO {
	public int insertByPosts(@Param("posts") Posts posts);
	public List<Posts> selectAll();
}
