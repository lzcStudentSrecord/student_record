package com.lzlz.student.record.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzlz.student.record.entiy.Credit;
import com.lzlz.student.record.service.CreditService;

@Controller
@RequestMapping("/Credit")
public class CreditController {
	private CreditService creditService;

	@Autowired
	public void setCreditService(CreditService creditService) {
		this.creditService = creditService;
	}

	@RequestMapping("/insertByCredit")
	public @ResponseBody int insertByCredit() {
		return creditService.insertByCredit(new Credit(0, 201615230142L, "java", "必修", 2));
	}

	@RequestMapping("/insertByList")
	public @ResponseBody int insertByList() {
		List<Credit> list = new ArrayList<>();
		list.add(new Credit(0, 201615230142L, "java", "必修", 2));
		return creditService.insertByList(list);
	}

	@RequestMapping("/updateByCredit")
	public @ResponseBody int updateByCredit() {
		return creditService.updateByCredit(new Credit(2, 201615230142L, "java", "选修", 2));
	}

	@RequestMapping("/deleteByCredId")
	public @ResponseBody int deleteByCredId() {
		return creditService.deleteByCredId(2);
	}

	@RequestMapping("/selectByTno")
	public @ResponseBody List<Credit> selectByTno() {
		return creditService.selectByTno(9901);
	}
}
