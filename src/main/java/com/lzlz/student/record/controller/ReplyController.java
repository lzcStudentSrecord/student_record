package com.lzlz.student.record.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lzlz.student.record.entiy.Reply;
import com.lzlz.student.record.entiy.Teacher;
import com.lzlz.student.record.service.ReplyService;

@Controller
@RequestMapping("/Reply")
public class ReplyController {
	private ReplyService replyService;

	@Autowired
	public void setReplyService(ReplyService replyService) {
		this.replyService = replyService;
	}

	@RequestMapping(value = "/insertByReply", method = RequestMethod.POST)
	public String insertByReply(@RequestParam("rcontent") String rcontent, @RequestParam("pid") long pid,
			HttpServletRequest request, HttpSession session) {
		Teacher teacher = (Teacher) session.getAttribute("teacher");
		int ret = replyService.insertByReply(new Reply(0, pid, rcontent, teacher.getTno(), null));
		if (ret != 0)
			request.setAttribute("ret", 18);
		else
			request.setAttribute("ret", 19);
		return "retprocess";
	}
}
