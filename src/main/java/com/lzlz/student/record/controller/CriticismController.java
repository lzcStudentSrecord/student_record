package com.lzlz.student.record.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzlz.student.record.entiy.Criticism;
import com.lzlz.student.record.service.CriticismService;

@Controller
@RequestMapping("/Criticism")
public class CriticismController {
	private CriticismService criticismService;

	@Autowired
	public void setCriticismService(CriticismService criticismService) {
		this.criticismService = criticismService;
	}

	@RequestMapping("/insertByCriticism")
	public @ResponseBody int insertByCriticism() {
		return criticismService.insertByCriticism(new Criticism(0, 201615230142L, "大一上学期", "过于装逼", "装逼", "禁止装逼一个月"));
	}

	@RequestMapping("/insertByList")
	public @ResponseBody int insertByList() {
		List<Criticism> list = new ArrayList<>();
		list.add(new Criticism(0, 201615230142L, "大一上学期", "过于装逼", "装逼", "禁止装逼两个月"));
		return criticismService.insertByList(list);
	}

	@RequestMapping("/updateByCriticism")
	public @ResponseBody int updateByCriticism() {
		return criticismService.updateByCriticism(new Criticism(1, 201615230142L, "大一上学期", "过于装逼", "装逼", "禁止装逼三个月"));
	}

	@RequestMapping("/deleteByCrid")
	public @ResponseBody int deleteByCrid() {
		return criticismService.deleteByCrid(2);
	}

	@RequestMapping("/selectByTno")
	public @ResponseBody List<Criticism> selectByTno() {
		return criticismService.selectByTno(9901);
	}
}
