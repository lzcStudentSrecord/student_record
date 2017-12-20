package com.lzlz.student.record.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.AdminDAO;
import com.lzlz.student.record.entiy.Admin;
import com.lzlz.student.record.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
	private AdminDAO adminDAO;

	@Autowired
	public void setDaAdminDAO(AdminDAO adminDAO) {
		this.adminDAO = adminDAO;
	}

	@Override
	public Admin selectByUsername(String username) {
		return adminDAO.selectByUsername(username);
	}

	@Override
	public int updateByAdmin(Admin admin) {
		return adminDAO.updateByAdmin(admin);
	}

}
