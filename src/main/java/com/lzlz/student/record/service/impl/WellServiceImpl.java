package com.lzlz.student.record.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.WellDAO;
import com.lzlz.student.record.entiy.Well;
import com.lzlz.student.record.service.WellService;

@Service("wellService")
public class WellServiceImpl implements WellService {
	private WellDAO wellDAO;

	@Autowired
	public void setWellDAO(WellDAO wellDAO) {
		this.wellDAO = wellDAO;
	}

	@Override
	public int insertByWell(Well well) {
		return wellDAO.insertByWell(well);
	}

	@Override
	public int insertByList(List<Well> list) {
		return wellDAO.insertByList(list);
	}

	@Override
	public List<Well> selectBySno(long sno) {
		return wellDAO.selectBySno(sno);
	}

	@Override
	public List<Well> selectByTno(long tno) {
		return wellDAO.selectByTno(tno);
	}

}
