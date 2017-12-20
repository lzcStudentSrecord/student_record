package com.lzlz.student.record.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzlz.student.record.entiy.GeneralCertificate;
import com.lzlz.student.record.service.GeneralCertificateService;

@Controller
@RequestMapping("/GeneralCertificate")
public class GeneralCertificateController {
	private GeneralCertificateService generalCertificateService;

	@Autowired
	public void setGeneralCertificateService(GeneralCertificateService generalCertificateService) {
		this.generalCertificateService = generalCertificateService;
	}

	@RequestMapping("/insertByGeneralCertificate")
	public @ResponseBody int insertByGeneralCertificate() {
		return generalCertificateService
				.insertByGeneralCertificate(new GeneralCertificate(0, 201615230142L, "计算机五级", "2017-12-20", 90.0f));
	}

	@RequestMapping("/insertByList")
	public @ResponseBody int insertByList() {
		List<GeneralCertificate> list = new ArrayList<>();
		list.add(new GeneralCertificate(0, 201615230142L, "计算机五级", "2017-12-21", 90.0f));
		return generalCertificateService.insertByList(list);
	}

	@RequestMapping("/updateByGeneralCertificate")
	public @ResponseBody int updateByGeneralCertificate() {
		return generalCertificateService
				.updateByGeneralCertificate(new GeneralCertificate(2, 201615230142L, "计算机四级", "2017-12-21", 90.0f));
	}

	@RequestMapping("/deleteByGcid")
	public @ResponseBody int deleteByGcid() {
		return generalCertificateService.deleteByGcid(2);
	}

	@RequestMapping("/selectByTno")
	public @ResponseBody List<GeneralCertificate> selectByTno() {
		return generalCertificateService.selectByTno(9901);
	}

}
