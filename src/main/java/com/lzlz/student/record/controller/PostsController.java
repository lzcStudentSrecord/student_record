package com.lzlz.student.record.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lzlz.student.record.service.PostsService;

@Controller
@RequestMapping("/Posts")
public class PostsController {
	private PostsService postsService;

	@Autowired
	public void setPostsService(PostsService postsService) {
		this.postsService = postsService;
	}

}
