package com.lzlz.student.record.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzlz.student.record.entiy.Well;
import com.lzlz.student.record.service.WellService;

@Controller
@RequestMapping("/Well")
public class WellController {
	private WellService wellService;

	@Autowired
	public void setWellService(WellService wellService) {
		this.wellService = wellService;
	}

	@RequestMapping("/insertByWell")
	public @ResponseBody int insertByWell() {
		return wellService.insertByWell(new Well(0, 201615230142L, "2017-12-21", "评优", "二次元大使"));
	}

	@RequestMapping("/insertByList")
	public @ResponseBody int insertByList() {
		List<Well> list = new ArrayList<>();
		list.add(new Well(0, 201615230142L, "2017-12-21", "评优", "二次元大使"));
		return wellService.insertByList(list);
	}

	@RequestMapping("/selectBySno")
	public @ResponseBody List<Well> selectBySno() {
		return wellService.selectBySno(201615230142L);
	}

	@RequestMapping("/selectByTno")
	public @ResponseBody List<Well> selectByTno() {
		return wellService.selectByTno(9901);
	}
}
