package com.lzlz.student.record.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lzlz.student.record.service.ReplyService;

@Controller
@RequestMapping("/Reply")
public class ReplyController {
	private ReplyService replyService;

	@Autowired
	public void setReplyService(ReplyService replyService) {
		this.replyService = replyService;
	}

}
