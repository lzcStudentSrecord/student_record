package com.lzlz.student.record.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.lzlz.student.record.entiy.Well;
import com.lzlz.student.record.service.CreditService;
import com.lzlz.student.record.service.CriticismService;
import com.lzlz.student.record.service.GeneralCertificateService;
import com.lzlz.student.record.service.ProfessCertificateService;
import com.lzlz.student.record.service.StudentService;
import com.lzlz.student.record.service.StudentTextbookService;
import com.lzlz.student.record.service.WellService;
import com.lzlz.student.record.util.ExcelProcess;

@Controller
@RequestMapping("/Well")
public class WellController {
	private WellService wellService;
	private CreditService creditService;
	private CriticismService criticismService;
	private GeneralCertificateService generalCertificateService;
	private StudentTextbookService studentTextbookService;
	private StudentService studentService;

	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@Autowired
	public void setWellService(WellService wellService) {
		this.wellService = wellService;
	}

	@Autowired
	public void setCreditService(CreditService creditService) {
		this.creditService = creditService;
	}

	@Autowired
	public void setCriticismService(CriticismService criticismService) {
		this.criticismService = criticismService;
	}

	@Autowired
	public void setStudentTextbookService(StudentTextbookService studentTextbookService) {
		this.studentTextbookService = studentTextbookService;
	}

	@Autowired
	public void setGeneralCertificateService(GeneralCertificateService generalCertificateService) {
		this.generalCertificateService = generalCertificateService;
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

	@RequestMapping(value = "/test", produces = { "text/html;charset=UTF-8" })
	public @ResponseBody String test(@RequestParam("excel") MultipartFile file) throws IOException {
		return ExcelProcess.studentProcess(studentService, file.getInputStream(), 1);
	}

}
