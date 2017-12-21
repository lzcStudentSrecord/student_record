package com.lzlz.student.record.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lzlz.student.record.entiy.Well;

@Service
public interface WellService {
	public int insertByWell(Well well);

	public int insertByList(List<Well> list);

	public List<Well> selectBySno(long sno);

	public List<Well> selectByTno(long tno);
}
