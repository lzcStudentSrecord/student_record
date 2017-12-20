package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.Reply;

@Repository
public interface ReplyDAO {
	public int insertByReply(@Param("reply") Reply reply);

	public List<Reply> selectByPid(@Param("pid") long pid);
}
