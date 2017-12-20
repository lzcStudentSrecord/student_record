package com.lzlz.student.record.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.Admin;

@Repository
public interface AdminDAO {
	public Admin selectByUsername(@Param("username") String username);

	public int updateByAdmin(@Param("admin") Admin admin);
}
