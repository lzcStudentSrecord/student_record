package com.lzlz.student.record.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.entiy.Posts;

@Service
public interface PostsService {
	public int insertByPosts(Posts posts);
	public List<Posts> selectAll();
}
