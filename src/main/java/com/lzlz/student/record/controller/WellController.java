package com.lzlz.student.record.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.lzlz.student.record.entiy.Student;
import com.lzlz.student.record.entiy.Teacher;
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
	private StudentService studentService;

	@Autowired
	public void setWellService(WellService wellService) {
		this.wellService = wellService;
	}


	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}


	@RequestMapping(value = "/deleteByTeacher", method = RequestMethod.GET)
	public String deleteByTeacher(@RequestParam("weid") long weid, HttpServletRequest request, HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		Well well = wellService.selectByWeid(weid);
		Student student = studentService.getStudentBySno(well.getSno());
		if (t.getTfrom() != student.getTfrom()) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		int ret = wellService.deleteByWeid(weid);
		if (ret != 0)
			request.setAttribute("ret", 12);
		else
			request.setAttribute("ret", 13);
		return "retprocess";
	}

	@RequestMapping(value = "/insertByList", method = RequestMethod.POST)
	public String insertByList(@RequestParam("excel") MultipartFile file, HttpServletRequest request)
			throws IOException {
		String oldname = file.getOriginalFilename();
		if (!oldname.substring(oldname.indexOf('.')).equalsIgnoreCase(".xls")) {
			request.setAttribute("ret", 14);
			return "retprocess";
		}
		String result = ExcelProcess.wellProcess(wellService, file.getInputStream());
		request.setAttribute("ret", 15);
		request.setAttribute("result", result);
		return "retprocess";
	}

	@RequestMapping(value = "/selectByTno", method = RequestMethod.GET)
	public String selectByTno(HttpServletRequest request, HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		List<Well> welllist = wellService.selectByTno(t.getTfrom());
		request.setAttribute("welllist", welllist);
		return "teacher_wellmanager";
	}

}
