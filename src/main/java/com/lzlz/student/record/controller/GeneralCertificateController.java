package com.lzlz.student.record.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.lzlz.student.record.entiy.GeneralCertificate;
import com.lzlz.student.record.entiy.Student;
import com.lzlz.student.record.entiy.Teacher;
import com.lzlz.student.record.service.GeneralCertificateService;
import com.lzlz.student.record.service.StudentService;
import com.lzlz.student.record.util.ExcelProcess;

@Controller
@RequestMapping("/GeneralCertificate")
public class GeneralCertificateController {
	private GeneralCertificateService generalCertificateService;
	private StudentService studentService;

	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@Autowired
	public void setGeneralCertificateService(GeneralCertificateService generalCertificateService) {
		this.generalCertificateService = generalCertificateService;
	}

	@RequestMapping(value = "/insertByList", method = RequestMethod.POST)
	public String insertByList(@RequestParam("excel") MultipartFile file, HttpServletRequest request,
			HttpSession session) throws IOException {
		String oldname = file.getOriginalFilename();
		if (!oldname.substring(oldname.indexOf('.')).equalsIgnoreCase(".xls")) {
			request.setAttribute("ret", 14);
			return "retprocess";
		}
		String result = ExcelProcess.generalCertificateProcess(generalCertificateService, file.getInputStream());
		request.setAttribute("ret", 15);
		request.setAttribute("result", result);
		return "retprocess";
	}

	@RequestMapping(value = "/deleteByGcid", method = RequestMethod.GET)
	public String deleteByGcid(@Param("gcid") long gcid, HttpServletRequest request, HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		GeneralCertificate generalCertificate = generalCertificateService.selectByGcid(gcid);
		Student student = studentService.getStudentBySno(generalCertificate.getSno());
		if (t.getTfrom() != student.getTfrom()) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		int ret = generalCertificateService.deleteByGcid(gcid);
		if (ret != 0)
			request.setAttribute("ret", 12);
		else
			request.setAttribute("ret", 13);
		return "retprocess";
	}

	@RequestMapping(value = "/selectByTno", method = RequestMethod.GET)
	public String selectByTno(HttpServletRequest request, HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		List<GeneralCertificate> GeneralCertificatelist = generalCertificateService.selectByTno(t.getTfrom());
		request.setAttribute("GeneralCertificatelist", GeneralCertificatelist);
		return "teacher_generalmanager";

	}

}
