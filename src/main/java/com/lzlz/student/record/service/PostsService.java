package com.lzlz.student.record.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lzlz.student.record.entiy.Posts;

@Service
public interface PostsService {
	public int insertByPosts(Posts posts);
	public int selectCount();
	public List<Posts> selectAll();
	public Posts selectByPid(long pid);
	public List<Posts> selectByFenYe(int first);
}
