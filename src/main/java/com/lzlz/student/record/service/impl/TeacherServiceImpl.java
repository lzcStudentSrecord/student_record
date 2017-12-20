package com.lzlz.student.record.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.TeacherDAO;
import com.lzlz.student.record.entiy.Teacher;
import com.lzlz.student.record.service.TeacherService;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
	private TeacherDAO teacherDAO;

	@Autowired
	public void setTeacherDAO(TeacherDAO teacherDAO) {
		this.teacherDAO = teacherDAO;
	}

	@Override
	public int insertByTeacher(Teacher teacher) {
		return teacherDAO.insertByTeacher(teacher);
	}

	@Override
	public Teacher selectByTno(long tno) {
		return teacherDAO.selectByTno(tno);
	}

	@Override
	public int updateByTeacher(Teacher teacher) {
		return teacherDAO.updateByTeacher(teacher);
	}

	@Override
	public int deleteByTno(long tno) {
		return teacherDAO.deleteByTno(tno);
	}

}
