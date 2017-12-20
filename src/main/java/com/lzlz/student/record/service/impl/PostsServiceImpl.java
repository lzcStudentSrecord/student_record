package com.lzlz.student.record.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.PostsDAO;
import com.lzlz.student.record.service.PostsService;

@Service("postsService")
public class PostsServiceImpl implements PostsService{
	private PostsDAO postsDAO;

	@Autowired
	public void setPostsDAO(PostsDAO postsDAO) {
		this.postsDAO = postsDAO;
	}

}
