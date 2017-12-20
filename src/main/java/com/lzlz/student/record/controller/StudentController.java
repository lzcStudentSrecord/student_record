package com.lzlz.student.record.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzlz.student.record.entiy.Student;
import com.lzlz.student.record.service.StudentService;

@Controller
@RequestMapping("/Student")
public class StudentController {
	private StudentService studentService;

	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping("/insertByList")
	public String insert() {
		List<Student> list = new ArrayList<>();
		list.add(new Student(201615230142L, "张路平", "男", 2016, 1, "软件与信息服务", "二次元", "+8617862733349", "张进强",
				"+8617865058755", "无", 1601, "在校"));
		System.out.println(studentService.insertByList(list));
		return null;
	}

	@RequestMapping(value = "/select", method = RequestMethod.GET)
	public String select(@RequestParam("id") long l, HttpServletRequest request) {
		List<Long> list = studentService.getAllId();
		if (list.contains(l)) {
			System.out.println("the id is exist");
			request.setAttribute("content", "天依殿下我爱你");
		}
		return "index";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update() {
		Student student = new Student(201615230142L, "张路平", "女", 2016, 1, "软件与信息服务", "二次元", "+8617862733349", "张进强",
				"+8617865058755", "无", 1601, "在校");
		studentService.updateByStudent(student);
		return null;
	}

	@RequestMapping(value = "/selectBySno", method = RequestMethod.GET)
	public @ResponseBody Student selectBySno() {
		return studentService.getStudentBySno(201615230142L);
	}

	@RequestMapping(value = "/deleteBySno", method = RequestMethod.GET)
	public @ResponseBody int deleteBySno() {
		return studentService.deleteBySno(201615230142L);
	}

	@RequestMapping(value = "/insertByStudent", method = RequestMethod.GET)
	public @ResponseBody int insertByStudent() {
		return studentService.insertByStudent(new Student(201615230142L, "张路平", "女", 2016, 1, "软件与信息服务", "二次元",
				"+8617862733349", "张进强", "+8617865058755", "无", 1601, "在校"));
	}
	
	@RequestMapping(value = "/selectAll", method = RequestMethod.GET)
	public @ResponseBody List<Student> selectAll(){
		return studentService.selectAll();
	}
}
