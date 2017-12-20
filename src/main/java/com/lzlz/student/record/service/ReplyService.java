package com.lzlz.student.record.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lzlz.student.record.entiy.Reply;

@Service
public interface ReplyService {
	public int insertByReply(Reply reply);
	
	public List<Reply> selectByPid(long pid);
}
