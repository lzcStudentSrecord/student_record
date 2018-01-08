package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.Reply;

@Repository
public interface ReplyDAO {
	/**
	 * 通过Reply添加一条数据
	 * 
	 * @param reply
	 *            关系映射的对象
	 * @return 结果码
	 */
	public int insertByReply(@Param("reply") Reply reply);
	/**
	 * 查询所有的回复帖通过主题帖id
	 * @param pid
	 *            主题帖id
	 * @return 数据集合
	 */
	public List<Reply> selectByPid(@Param("pid") long pid,@Param("first") int first);
	/**
	 * 查询所有个数
	 * @return
	 */
	public int selectByCount();
	
}
