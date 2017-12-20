package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.Criticism;

@Repository
public interface CriticismDAO {
	public int insertByCriticism(@Param("criticism") Criticism criticism);

	public int insertByList(@Param("list") List<Criticism> list);

	public int updateByCriticism(@Param("criticism") Criticism criticism);

	public int deleteByCrid(@Param("crid") long crid);

	public List<Criticism> selectByTno(@Param("criticism") long tno);
}
