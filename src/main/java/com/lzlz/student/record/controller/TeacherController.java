package com.lzlz.student.record.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzlz.student.record.entiy.Teacher;
import com.lzlz.student.record.service.TeacherService;

@Controller
@RequestMapping("/Teacher")
public class TeacherController {
	private TeacherService teacherService;

	@Autowired
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	@RequestMapping(value = "/insertByTeacher", method = RequestMethod.GET)
	public @ResponseBody int insertByTeacher() {
		return teacherService.insertByTeacher(new Teacher(12306L, "洛天依", "女", "123456", 1601L));
	}

	@RequestMapping(value = "/selectByTno", method = RequestMethod.GET)
	public @ResponseBody Teacher selectByTno() {
		return teacherService.selectByTno(12306L);
	}

	@RequestMapping(value = "/updateByTeacher", method = RequestMethod.GET)
	public @ResponseBody int updateByTeacher() {
		return teacherService.updateByTeacher(new Teacher(12306L, "乐正绫", "女", "123456", 1601L));
	}

	@RequestMapping(value = "/deleteByTno", method = RequestMethod.GET)
	public @ResponseBody int deleteByTno() {
		return teacherService.deleteByTno(12306L);
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpSession session, HttpServletRequest request, String username, String password) {
		Teacher teacher = teacherService.selectByTno(Long.parseLong(username));
		if (teacher == null) {
			request.setAttribute("ret", 1);
			return "retprocess";
		}
		if (!teacher.getTpassword().equals(password)) {
			request.setAttribute("ret", 2);
			return "retprocess";
		}
		session.setAttribute("student", null);
		session.setAttribute("teacher", teacher);
		request.setAttribute("ret", 3);
		return "retprocess";
	}
}
