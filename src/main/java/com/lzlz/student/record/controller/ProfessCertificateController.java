package com.lzlz.student.record.controller;

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

import com.lzlz.student.record.entiy.ProfessCertificate;
import com.lzlz.student.record.entiy.Student;
import com.lzlz.student.record.entiy.Teacher;
import com.lzlz.student.record.entiy.Well;
import com.lzlz.student.record.service.ProfessCertificateService;
import com.lzlz.student.record.service.StudentService;
import com.lzlz.student.record.util.ExcelProcess;

@Controller
@RequestMapping("/ProfessCertificate")
public class ProfessCertificateController {
	private ProfessCertificateService professCertificateService;
	private StudentService studentService;

	@Autowired
	public void setProfessCertificateService(ProfessCertificateService professCertificateService) {
		this.professCertificateService = professCertificateService;
	}

	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping(value = "/insertByStudent", method = RequestMethod.POST)
	public String insertByProfessCertificate(ProfessCertificate professCertificate, HttpServletRequest request,
			HttpSession session) {
		professCertificate.setPcstate("未确认");
		professCertificate.setSno(((Student) session.getAttribute("student")).getSno());
		int ret = professCertificateService.insertByProfessCertificate(professCertificate);
		if (ret != 0)
			request.setAttribute("ret", 6);
		else
			request.setAttribute("ret", 7);
		return "retprocess";
	}

	@RequestMapping(value = "/selectByPcid", method = RequestMethod.GET)
	public String selectByPcid(@RequestParam("pcid") long pcid, HttpServletRequest request, HttpSession session) {
		Teacher teacher = (Teacher) session.getAttribute("teacher");
		if (teacher == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		ProfessCertificate professCertificate = professCertificateService.selectByPcid(pcid);
		request.setAttribute("professupdate", professCertificate);
		return "teacher_professupdate";
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

	@RequestMapping(value = "/deleteByPcid", method = RequestMethod.GET)
	public String deleteByPcid(@RequestParam("pcid") long pcid, HttpServletRequest request, HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		ProfessCertificate professCertificate = professCertificateService.selectByPcid(pcid);
		Student student = studentService.getStudentBySno(professCertificate.getSno());
		if (t.getTfrom() != student.getTfrom()) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		int ret = professCertificateService.deleteByPcid(pcid);
		if (ret != 0)
			request.setAttribute("ret", 12);
		else
			request.setAttribute("ret", 13);
		return "retprocess";
	}

	@RequestMapping("/selectByTnoWithNoPass")
	public String selectByTnoWithNoPass(HttpServletRequest request, HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		List<ProfessCertificate> professCertificatelist = professCertificateService
				.selectByTnoWithNoPass(t.getTfrom());
		request.setAttribute("professCertificatelist", professCertificatelist);
		return "teacher_professConfirm";
	}

	@RequestMapping("/selectByTnoWithHadPass")
	public String selectByTnoWithHadPass(HttpServletRequest request, HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		List<ProfessCertificate> professCertificatelist = professCertificateService
				.selectByTnoWithHadPass(t.getTfrom());
		request.setAttribute("professCertificatelist", professCertificatelist);
		return "teacher_professmanager";
	}

}
