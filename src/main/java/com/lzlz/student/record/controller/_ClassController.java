package com.lzlz.student.record.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzlz.student.record.entiy._Class;
import com.lzlz.student.record.service._ClassService;

@Controller
@RequestMapping("/_Class")
public class _ClassController {
	private _ClassService _classService;

	@Autowired
	public void set_classService(_ClassService _classService) {
		this._classService = _classService;
	}

	@RequestMapping("/insertBy_Class")
	public @ResponseBody int insertBy_Class() {
		return _classService.insertBy_Class(new _Class(1601L, "软件与信息服务"));
	}

	@RequestMapping("/selectByC_no")
	public @ResponseBody _Class selectByC_no() {
		return _classService.selectByC_no(1601L);
	}

	@RequestMapping("/selectAll")
	public @ResponseBody List<_Class> selectAll() {
		return _classService.selectAll();
	}

	@RequestMapping("/updateBy_Class")
	public @ResponseBody int updateBy_Class() {
		return _classService.updateBy_Class(new _Class(1601L, "软件工程"));
	}
	@RequestMapping("/deleteByC_no")
	public @ResponseBody int deleteBy_Class(){
		return _classService.deleteByC_no(1601L);
	}
	
}
