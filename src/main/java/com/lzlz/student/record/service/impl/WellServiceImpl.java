package com.lzlz.student.record.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.WellDAO;
import com.lzlz.student.record.service.WellService;

@Service("wellService")
public class WellServiceImpl implements WellService{
	private WellDAO wellDAO;

	@Autowired
	public void setWellDAO(WellDAO wellDAO) {
		this.wellDAO = wellDAO;
	}

}
