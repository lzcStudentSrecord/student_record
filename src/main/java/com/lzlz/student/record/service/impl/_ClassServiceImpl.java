package com.lzlz.student.record.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao._ClassDAO;
import com.lzlz.student.record.entiy._Class;
import com.lzlz.student.record.service._ClassService;

@Service("_classService")
public class _ClassServiceImpl implements _ClassService {
	private _ClassDAO _classDAO;

	@Autowired
	public void set_classDAO(_ClassDAO _classDAO) {
		this._classDAO = _classDAO;
	}

	@Override
	public int insertBy_Class(_Class _class) {
		return _classDAO.insertBy_Class(_class);
	}

	@Override
	public _Class selectByC_no(long c_no) {
		return _classDAO.selectByC_no(c_no);
	}

	@Override
	public List<_Class> selectAll() {
		return _classDAO.selectAll();
	}

	@Override
	public int updateBy_Class(_Class _class) {
		return _classDAO.updateBy_Class(_class);
	}

	@Override
	public int deleteByC_no(long c_no) {
		return _classDAO.deleteByC_no(c_no);
	}

}
