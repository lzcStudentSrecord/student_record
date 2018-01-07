package com.lzlz.student.record.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.CriticismDAO;
import com.lzlz.student.record.entiy.Criticism;
import com.lzlz.student.record.service.CriticismService;

@Service("criticismService")
public class CriticismServiceImpl implements CriticismService {
	private CriticismDAO criticismDAO;

	@Autowired
	public void setCriticismDAO(CriticismDAO criticismDAO) {
		this.criticismDAO = criticismDAO;
	}

	@Override
	public int insertByCriticism(Criticism criticism) {
		return criticismDAO.insertByCriticism(criticism);
	}

	@Override
	public int insertByList(List<Criticism> list) {
		return criticismDAO.insertByList(list);
	}

	@Override
	public int updateByCriticism(Criticism criticism) {
		return criticismDAO.updateByCriticism(criticism);
	}

	@Override
	public int deleteByCrid(long crid) {
		return criticismDAO.deleteByCrid(crid);
	}

	@Override
	public List<Criticism> selectByTno(long tno) {
		return criticismDAO.selectByTno(tno);
	}

	@Override
	public Criticism selectByCrid(long crid) {
		return criticismDAO.selectByCrid(crid);
	}

}
