package com.lzlz.student.record.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzlz.student.record.entiy.ProfessCertificate;
import com.lzlz.student.record.service.ProfessCertificateService;

@Controller
@RequestMapping("/ProfessCertificate")
public class ProfessCertificateController {
	private ProfessCertificateService professCertificateService;

	@Autowired
	public void setProfessCertificateService(ProfessCertificateService professCertificateService) {
		this.professCertificateService = professCertificateService;
	}

	@RequestMapping("/insertByProfessCertificate")
	public @ResponseBody int insertByProfessCertificate() {
		return professCertificateService
				.insertByProfessCertificate(new ProfessCertificate(0, 201615230142L, "架构师", "2017-12-20","二次元大使馆","未确认"));
	}

	@RequestMapping("/insertByList")
	public @ResponseBody int insertByList() {
		List<ProfessCertificate> list = new ArrayList<>();
		list.add(new ProfessCertificate(0, 201615230142L, "架构师", "2017-12-20","二次元大使馆","未确认"));
		return professCertificateService.insertByList(list);
	}

	@RequestMapping("/updateByProfessCertificate")
	public @ResponseBody int updateByProfessCertificate() {
		return professCertificateService
				.updateByProfessCertificate(new ProfessCertificate(2, 201615230142L, "软件工程师", "2017-12-20","二次元大使馆","未确认"));
	}

	@RequestMapping("/deleteByPcid")
	public @ResponseBody int deleteByPcid() {
		return professCertificateService.deleteByPcid(2);
	}

	@RequestMapping("/selectByTnoWithNoPass")
	public @ResponseBody List<ProfessCertificate> selectByTnoWithNoPass() {
		return professCertificateService.selectByTnoWithNoPass(201615230142L);
	}

	@RequestMapping("/selectBySnoWithAll")
	public @ResponseBody List<ProfessCertificate> selectBySnoWithAll() {
		return professCertificateService.selectBySnoWithAll(201615230142L);
	}
}
