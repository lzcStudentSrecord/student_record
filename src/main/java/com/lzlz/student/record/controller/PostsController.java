package com.lzlz.student.record.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzlz.student.record.entiy.Posts;
import com.lzlz.student.record.service.PostsService;

@Controller
@RequestMapping("/Posts")
public class PostsController {
	private PostsService postsService;

	@Autowired
	public void setPostsService(PostsService postsService) {
		this.postsService = postsService;
	}

	@RequestMapping("/insertByPosts")
	public @ResponseBody int insertByPosts() {
		return postsService.insertByPosts(new Posts(0, "天依殿下我爱你", "I LOVE U", 201615230142L, null));
	}
	
	@RequestMapping("/selectAll")
	public @ResponseBody List<Posts> selectAll(){
		return postsService.selectAll();
	}
}
