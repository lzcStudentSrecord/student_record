package com.lzlz.student.record.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.lzlz.student.record.entiy.Activity;
import com.lzlz.student.record.entiy.AdjustLesson;
import com.lzlz.student.record.entiy.ApplyClassroom;
import com.lzlz.student.record.entiy.Posts;
import com.lzlz.student.record.entiy.Student;
import com.lzlz.student.record.entiy.Teacher;
import com.lzlz.student.record.service.ActivityService;
import com.lzlz.student.record.service.AdjustLessonService;
import com.lzlz.student.record.service.ApplyClassroomService;
import com.lzlz.student.record.service.PostsService;
import com.lzlz.student.record.service.StudentService;
import com.lzlz.student.record.util.CustomerUtil;
import com.lzlz.student.record.util.ExcelProcess;

@Controller
@RequestMapping("/Student")
public class StudentController {
	private StudentService studentService;
	private ApplyClassroomService applyClassroomService;
	private ActivityService activityService;
	private AdjustLessonService adjustLessonService;
	private PostsService postsService;

	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@Autowired
	public void setApplyClassroomService(ApplyClassroomService applyClassroomService) {
		this.applyClassroomService = applyClassroomService;
	}

	@Autowired
	public void setActivityService(ActivityService activityService) {
		this.activityService = activityService;
	}

	@Autowired
	public void setAdjustLessonService(AdjustLessonService adjustLessonService) {
		this.adjustLessonService = adjustLessonService;
	}

	@Autowired
	public void setPostsService(PostsService postsService) {
		this.postsService = postsService;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, HttpSession session, String username, String password) {
		Student student = studentService.getStudentBySno(Long.parseLong(username));
		if (student == null) {
			request.setAttribute("ret", 1);
			return "retprocess";
		}
		if (!(username.equals(password))) {
			request.setAttribute("ret", 2);
			return "retprocess";
		}
		session.setAttribute("teacher", null);
		session.setAttribute("student", student);
		request.setAttribute("ret", 3);
		return "retprocess";
	}

	@RequestMapping(value = "/insertByList", method = RequestMethod.POST)
	public String insert(@RequestParam("excel") MultipartFile file, HttpServletRequest request, HttpSession session)
			throws IOException {
		String filename = file.getOriginalFilename();
		if (!filename.substring(filename.indexOf('.')).equalsIgnoreCase(".xls")) {
			request.setAttribute("ret", 14);
			return "retprocess";
		}
		Teacher t = (Teacher) session.getAttribute("teacher");
		String result = ExcelProcess.studentProcess(studentService, file.getInputStream(), t.getTfrom());
		request.setAttribute("ret", 15);
		request.setAttribute("result", result);
		return "retprocess";
	}

	@RequestMapping(value = "/updateByStudent", method = RequestMethod.POST)
	public String update(String sphone, String sparent, String sparent_phone, String sjob, HttpServletRequest request,
			HttpSession session) {
		Student student = (Student) session.getAttribute("student");
		student.setSphone(sphone);
		student.setSparent(sparent);
		student.setSparentPhone(sparent_phone);
		student.setSjob(sjob);
		int ret = studentService.updateByStudent(student);
		if (ret != 0)
			request.setAttribute("ret", 4);
		else
			request.setAttribute("ret", 5);
		session.setAttribute("student", student);
		return "retprocess";
	}

	@RequestMapping(value = "/updateByTeacher", method = RequestMethod.POST)
	public String updateByTeacher(Student stu1, HttpServletRequest request, HttpSession session) {
		stu1.setTfrom(((Teacher) session.getAttribute("teacher")).getTfrom());
		System.out.println((Student) session.getAttribute("student"));
		int ret = studentService.updateByStudent(stu1);
		if (ret != 0)
			request.setAttribute("ret", 4);
		else
			request.setAttribute("ret", 5);
		return "retprocess";
	}

	@RequestMapping(value = "/selectBySno", method = RequestMethod.GET)
	public String selectBySno(@RequestParam("sno") long sno, HttpServletRequest request, HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		Student student = studentService.getStudentBySno(sno);
		if (student == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		if (student.getTfrom() != t.getTfrom()) {
			request.setAttribute("ret", -1);
			return "retprocess";
		} else {
			request.setAttribute("updatestudent", student);
			return "teacher_studentupdate";
		}
	}

	@RequestMapping(value = "/deleteBySno", method = RequestMethod.GET)
	public String deleteBySno(@RequestParam("sno") long sno, HttpServletRequest request, HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		Student student = studentService.getStudentBySno(sno);
		if (student == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		if (student.getTfrom() != t.getTfrom()) {
			request.setAttribute("ret", -1);
			return "retprocess";
		} else {
			int ret = studentService.deleteBySno(sno);
			if (ret != 0)
				request.setAttribute("ret", 12);
			else
				request.setAttribute("ret", 13);
			return "retprocess";
		}
	}

	@RequestMapping(value = "/selectAllByTno", method = RequestMethod.GET)
	public String selectAllByTno(HttpServletRequest request, HttpSession session) {
		Teacher t = (Teacher) session.getAttribute("teacher");
		if (t == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		List<Student> list = studentService.selectAllByTno(t.getTfrom());
		request.setAttribute("studentlist", list);
		return "teacher_stumanager";
	}

	@RequestMapping(value = "/getMessageBySno", method = RequestMethod.GET)
	public String getMessageBySno(HttpServletRequest request, HttpSession session) {
		Student student = (Student) session.getAttribute("student");
		if (student == null) {
			request.setAttribute("ret", -1);
			return "retprocess";
		}
		List<Activity> activitylist = activityService.selectAllByProposer(student.getSno());
		List<ApplyClassroom> applyroomlist = applyClassroomService.selectBySno(student.getSno());
		request.setAttribute("activitylist", activitylist);
		request.setAttribute("applyroomlist", applyroomlist);
		return "student_messagelist";
	}

	@RequestMapping(value = "/newlist", method = RequestMethod.GET)
	public String goHome(HttpServletRequest request) {
		List<AdjustLesson> adjustlist = adjustLessonService.selectAll();
		List<ApplyClassroom> applylist = applyClassroomService.selectByToday();
		request.setAttribute("adjustlist", adjustlist);
		request.setAttribute("applylist", applylist);
		return "newslist";
	}

	@RequestMapping(value = "/adjustList", method = RequestMethod.GET)
	public String adjustList(@RequestParam("curpage") int curpage, HttpServletRequest request) {
		List<AdjustLesson> alist = adjustLessonService.selectAll();
		if (alist.size() == 0) {
			alist = null;
		} else if (alist.size() < 5) {
			alist = alist.subList(0, alist.size());
		} else {
			alist = alist.subList(0, 5);
		}
		List<Posts> plist = postsService.selectByFenYe(CustomerUtil.getFirstValue(curpage, 5));
		request.setAttribute("curpage", curpage);
		request.setAttribute("allpage", CustomerUtil.getPageByCount(postsService.selectCount(), 5));
		request.setAttribute("plist", plist);
		request.setAttribute("applylistbyfour", null);
		request.setAttribute("adjustlistbyfour", alist);
		return "home";
	}

	@RequestMapping(value = "/applyList", method = RequestMethod.GET)
	public String applyList(@RequestParam("curpage") int curpage, HttpServletRequest request) {

		List<ApplyClassroom> alist = applyClassroomService.selectByToday();
		if (alist.size() == 0) {
			alist = null;
		} else if (alist.size() < 5) {
			alist = alist.subList(0, alist.size());
		} else {
			alist = alist.subList(0, 5);
		}
		List<Posts> plist = postsService.selectByFenYe(CustomerUtil.getFirstValue(curpage, 5));
		request.setAttribute("curpage", curpage);
		request.setAttribute("allpage", CustomerUtil.getPageByCount(postsService.selectCount(), 5));
		request.setAttribute("plist", plist);
		request.setAttribute("adjustlistbyfour", null);
		request.setAttribute("applylistbyfour", alist);
		return "home";
	}
}
