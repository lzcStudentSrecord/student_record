package com.lzlz.student.record.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lzlz.student.record.entiy.Credit;

@Service
public interface CreditService {
	public int insertByCredit(Credit credit);

	public int insertByList(List<Credit> list);

	public int updateByCredit(Credit credit);

	public int deleteByCredId(long credId);

	public List<Credit> selectByTno(long tno);
	
	public Credit selectByCredId(long credId);
}
