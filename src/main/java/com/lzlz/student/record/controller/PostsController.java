package com.lzlz.student.record.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lzlz.student.record.entiy.Posts;
import com.lzlz.student.record.entiy.Reply;
import com.lzlz.student.record.entiy.Student;
import com.lzlz.student.record.service.PostsService;
import com.lzlz.student.record.service.ReplyService;
import com.lzlz.student.record.util.CustomerUtil;

@Controller
@RequestMapping("/Posts")
public class PostsController {
	private PostsService postsService;
	private ReplyService replyService;

	@Autowired
	public void setPostsService(PostsService postsService) {
		this.postsService = postsService;
	}

	@Autowired
	public void setReplyService(ReplyService replyService) {
		this.replyService = replyService;
	}

	@RequestMapping(value = "/insertByPosts", method = RequestMethod.POST)
	public String insertByPosts(@RequestParam("ptitle") String ptitle, @RequestParam("pcontent") String pcontent,
			HttpServletRequest request, HttpSession session) {
		Student student = (Student) session.getAttribute("student");
		Posts posts = new Posts(0, ptitle, pcontent, student.getSno(), null);
		int ret = postsService.insertByPosts(posts);
		if (ret != 0)
			request.setAttribute("ret", 16);
		else
			request.setAttribute("ret", 17);
		return "retprocess";
	}

	@RequestMapping(value = "/selectByPid", method = RequestMethod.GET)
	public String selectByPid(@RequestParam("pid") long pid, @RequestParam("curpage") int curpage,
			HttpServletRequest request, HttpSession session) {
		Posts posts = postsService.selectByPid(pid);
		List<Reply> rlist = replyService.selectByPid(pid, CustomerUtil.getFirstValue(curpage, 5));
		if (posts == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		System.out.println(posts.toString());
		request.setAttribute("log", posts);
		request.setAttribute("rlist", rlist);
		request.setAttribute("curpage", curpage);
		request.setAttribute("allpage", CustomerUtil.getPageByCount(replyService.selectByCount(), 5));
		return "bloginfo";
	}
}
