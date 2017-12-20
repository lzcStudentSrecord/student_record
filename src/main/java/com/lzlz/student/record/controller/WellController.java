package com.lzlz.student.record.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lzlz.student.record.service.WellService;

@Controller
@RequestMapping("/Well")
public class WellController {
	private WellService wellService;

	@Autowired
	public void setWellService(WellService wellService) {
		this.wellService = wellService;
	}

}
