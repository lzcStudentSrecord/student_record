package com.lzlz.student.record.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzlz.student.record.entiy.ProfessCertificate;
import com.lzlz.student.record.entiy.Student;
import com.lzlz.student.record.service.ProfessCertificateService;

@Controller
@RequestMapping("/ProfessCertificate")
public class ProfessCertificateController {
	private ProfessCertificateService professCertificateService;

	@Autowired
	public void setProfessCertificateService(ProfessCertificateService professCertificateService) {
		this.professCertificateService = professCertificateService;
	}

	@RequestMapping(value = "/insertByStudent", method = RequestMethod.POST)
	public String insertByProfessCertificate(ProfessCertificate professCertificate, HttpServletRequest request,
			HttpSession session) {
		professCertificate.setPcstate("未确认");
		professCertificate.setSno(((Student) session.getAttribute("student")).getSno());
		int ret = professCertificateService.insertByProfessCertificate(professCertificate);
		if (ret != 0)
			request.setAttribute("ret", 5);
		else
			request.setAttribute("ret", 6);
		return "retprocess";
	}

	@RequestMapping("/insertByList")
	public @ResponseBody int insertByList() {
		List<ProfessCertificate> list = new ArrayList<>();
		list.add(new ProfessCertificate(0, 201615230142L, "架构师", "2017-12-20", "二次元大使馆", "未确认"));
		return professCertificateService.insertByList(list);
	}

	@RequestMapping(value = "/updateByTeacher", method = RequestMethod.POST)
	public String updateByProfessCertificate(ProfessCertificate professCertificate, HttpServletRequest request,
			HttpSession session) {
		professCertificate.setPcstate("已确认");
		int ret = professCertificateService.updateByProfessCertificate(professCertificate);
		if (ret != 0)
			request.setAttribute("ret", 4);
		else
			request.setAttribute("ret", 5);
		return "retprocess";
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
