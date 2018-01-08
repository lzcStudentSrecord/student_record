package com.lzlz.student.record.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.entiy.Reply;

@Service
public interface ReplyService {
	public int insertByReply(Reply reply);
	
	public List<Reply> selectByPid(@Param("pid") long pid,@Param("first") int first);
	
	public int selectByCount();
}
