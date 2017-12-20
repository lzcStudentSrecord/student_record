package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.Credit;

@Repository
public interface CreditDAO {
	public int insertByCredit(@Param("credit") Credit credit);

	public int insertByList(@Param("list") List<Credit> list);

	public int updateByCredit(@Param("credit") Credit credit);

	public int deleteByCredId(@Param("credId") long credId);

	public List<Credit> selectByTno(@Param("Tno") long tno);
}
