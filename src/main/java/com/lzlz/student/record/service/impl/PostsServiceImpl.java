package com.lzlz.student.record.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.PostsDAO;
import com.lzlz.student.record.entiy.Posts;
import com.lzlz.student.record.service.PostsService;

@Service("postsService")
public class PostsServiceImpl implements PostsService {
	private PostsDAO postsDAO;

	@Autowired
	public void setPostsDAO(PostsDAO postsDAO) {
		this.postsDAO = postsDAO;
	}

	@Override
	public int insertByPosts(Posts posts) {
		return postsDAO.insertByPosts(posts);
	}

	@Override
	public List<Posts> selectAll() {
		return postsDAO.selectAll();
	}

	@Override
	public Posts selectByPid(long pid) {
		return postsDAO.selectByPid(pid);
	}

	@Override
	public List<Posts> selectByFenYe(int first) {
		return postsDAO.selectByFenYe(first);
	}

	@Override
	public int selectCount() {
		return postsDAO.selectCount();
	}

}
