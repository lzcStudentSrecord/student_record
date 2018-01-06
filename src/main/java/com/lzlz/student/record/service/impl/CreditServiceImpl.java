package com.lzlz.student.record.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.CreditDAO;
import com.lzlz.student.record.entiy.Credit;
import com.lzlz.student.record.service.CreditService;

@Service("creditServiceImpl")
public class CreditServiceImpl implements CreditService {
	private CreditDAO creditDAO;

	@Autowired
	public void setCreditDAO(CreditDAO creditDAO) {
		this.creditDAO = creditDAO;
	}

	@Override
	public int insertByCredit(Credit credit) {
		return creditDAO.insertByCredit(credit);
	}

	@Override
	public int insertByList(List<Credit> list) {
		return creditDAO.insertByList(list);
	}

	@Override
	public int updateByCredit(Credit credit) {
		return creditDAO.updateByCredit(credit);
	}

	@Override
	public int deleteByCredId(long credId) {
		return creditDAO.deleteByCredId(credId);
	}

	@Override
	public List<Credit> selectByTno(long tno) {
		return creditDAO.selectByTno(tno);
	}

	@Override
	public Credit selectByCredId(long credId) {
		return creditDAO.selectByCredId(credId);
	}

}
