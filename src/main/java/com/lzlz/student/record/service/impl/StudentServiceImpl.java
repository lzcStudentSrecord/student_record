package com.lzlz.student.record.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.StudentDAO;
import com.lzlz.student.record.entiy.Student;
import com.lzlz.student.record.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	private StudentDAO studentDAO;

	@Autowired
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	@Override
	public int insertByList(List<Student> list) {
		return studentDAO.insertByList(list);
	}

	@Override
	public List<Long> getAllId() {
		return studentDAO.getAllId();
	}

	@Override
	public int updateByStudent(Student student) {
		return studentDAO.updateByStudent(student);
	}

	@Override
	public Student getStudentBySno(long sno) {
		return studentDAO.getStudentBySno(sno);
	}

	@Override
	public int deleteBySno(long sno) {
		return studentDAO.deleteBySno(sno);
	}

	@Override
	public int insertByStudent(Student student) {
		return studentDAO.insertByStudent(student);
	}

	@Override
	public List<Student> selectAll() {
		// TODO Auto-generated method stub
		return studentDAO.selectAll();
	}

}
