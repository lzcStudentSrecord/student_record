package com.lzlz.student.record.service;

import org.springframework.stereotype.Service;

import com.lzlz.student.record.entiy.Admin;

@Service
public interface AdminService {
	public Admin selectByUsername(String username);

	public int updateByAdmin(Admin admin);
}
