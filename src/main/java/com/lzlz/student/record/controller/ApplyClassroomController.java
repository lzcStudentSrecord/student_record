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

import com.lzlz.student.record.entiy.ApplyClassroom;
import com.lzlz.student.record.entiy.Student;
import com.lzlz.student.record.entiy.Teacher;
import com.lzlz.student.record.service.ApplyClassroomService;
import com.lzlz.student.record.service.StudentService;

@Controller
@RequestMapping("/ApplyClassroom")
public class ApplyClassroomController {
	private ApplyClassroomService applyClassroomService;
	private StudentService studentService;

	@Autowired
	public void setApplyClassroomService(ApplyClassroomService applyClassroomService) {
		this.applyClassroomService = applyClassroomService;
	}

	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping(value = "/insertByStudent", method = RequestMethod.POST)
	public @ResponseBody int insertByStudent(ApplyClassroom applyClassroom, HttpServletRequest request,
			HttpSession session) {
		applyClassroom.setAcstate("未通过");
		applyClassroom.setProposer(((Student) session.getAttribute("student")).getSno());
		return applyClassroomService.insertByApplyClassroom(applyClassroom);
	}

	@RequestMapping(value = "/insertByTeacher", method = RequestMethod.POST)
	public @ResponseBody int insertByTeacher(ApplyClassroom applyClassroom, HttpServletRequest request,
			HttpSession session) {
		applyClassroom.setProposer(((Teacher) session.getAttribute("teacher")).getTno());
		applyClassroom.setAcstate("已通过");
		return applyClassroomService.insertByApplyClassroom(applyClassroom);
	}

	@RequestMapping(value = "/selectByToday", method = RequestMethod.GET)
	public @ResponseBody List<ApplyClassroom> selectByToday() {
		return applyClassroomService.selectByToday();
	}

	@RequestMapping(value = "/selectByTno", method = RequestMethod.GET)
	public String selectByTno(HttpServletRequest request, HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		List<ApplyClassroom> applyClassroomlist = applyClassroomService.selectByTno(t.getTfrom());
		request.setAttribute("applyClassroomlist", applyClassroomlist);
		return "teacher_applyclassroommanager";
	}

	@RequestMapping(value = "/updateByAcid", method = RequestMethod.GET)
	public String updateByAcid(@RequestParam("acid") long acid, HttpServletRequest request, HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		ApplyClassroom applyClassroom = applyClassroomService.selectByAcid(acid);
		Student student = studentService.getStudentBySno(applyClassroom.getProposer());
		if (t.getTfrom() != student.getTfrom()) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		int ret = applyClassroomService.updateByAcid(acid);
		if (ret != 0)
			request.setAttribute("ret", 9);
		else
			request.setAttribute("ret", 11);
		return "retprocess";
	}

	@RequestMapping(value = "/deleteByAcid", method = RequestMethod.GET)
	public String deleteByAcid(long acid, HttpServletRequest request, HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		ApplyClassroom applyClassroom = applyClassroomService.selectByAcid(acid);
		Student student = studentService.getStudentBySno(applyClassroom.getProposer());
		if (t.getTfrom() != student.getTfrom()) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		int ret = applyClassroomService.deleteByAcid(acid);
		if (ret != 0)
			request.setAttribute("ret", 12);
		else
			request.setAttribute("ret", 13);
		return "retprocess";
	}

	@RequestMapping(value = "/selectByAcid", method = RequestMethod.GET)
	public String selectByAcid(@RequestParam("acid") int acid, HttpServletRequest request) {
		ApplyClassroom applyClassroom = applyClassroomService.selectByAcid(acid);
		request.setAttribute("applyinfo", applyClassroom);
		return "applyinfo";
	}
}
