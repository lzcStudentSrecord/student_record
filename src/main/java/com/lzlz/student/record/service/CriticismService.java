package com.lzlz.student.record.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lzlz.student.record.entiy.Criticism;

@Service
public interface CriticismService {
	public int insertByCriticism(Criticism criticism);

	public int insertByList(List<Criticism> list);

	public int updateByCriticism(Criticism criticism);

	public int deleteByCrid(long crid);

	public List<Criticism> selectByTno(long tno);
}
