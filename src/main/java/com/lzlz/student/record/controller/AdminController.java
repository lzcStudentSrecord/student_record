package com.lzlz.student.record.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzlz.student.record.entiy.Admin;
import com.lzlz.student.record.service.AdminService;

@Controller
@RequestMapping("/Admin")
public class AdminController {
	private AdminService adminService;

	@Autowired
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	@RequestMapping("/selectByUsername")
	public @ResponseBody Admin selectByUsername() {
		return adminService.selectByUsername("admin");
	}

	@RequestMapping("/updateByAdmin")
	public @ResponseBody int updateByAdmin() {
		return adminService.updateByAdmin(new Admin("admin", "admin"));
	}
}
