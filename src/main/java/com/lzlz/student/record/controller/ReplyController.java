package com.lzlz.student.record.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzlz.student.record.entiy.Reply;
import com.lzlz.student.record.service.ReplyService;

@Controller
@RequestMapping("/Reply")
public class ReplyController {
	private ReplyService replyService;

	@Autowired
	public void setReplyService(ReplyService replyService) {
		this.replyService = replyService;
	}
	
	@RequestMapping("/insertByReply")
	public @ResponseBody int insertByReply(){
		return replyService.insertByReply(new Reply(0, 1, "我也爱爱爱爱啊",201615230142L, null));
	}
	
	@RequestMapping("/selectByPid")
	public @ResponseBody List<Reply> selectByPid(){
		return replyService.selectByPid(1);
	}
}
