package com.lzlz.student.record.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.ReplyDAO;
import com.lzlz.student.record.entiy.Reply;
import com.lzlz.student.record.service.ReplyService;

@Service("replyService")
public class ReplyServiceImpl implements ReplyService {
	private ReplyDAO replyDAO;

	@Autowired
	public void setReplyDAO(ReplyDAO replyDAO) {
		this.replyDAO = replyDAO;
	}

	@Override
	public int insertByReply(Reply reply) {
		return replyDAO.insertByReply(reply);
	}

	@Override
	public List<Reply> selectByPid(long pid) {
		return replyDAO.selectByPid(pid);
	}

}
