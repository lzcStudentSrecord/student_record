package com.lzlz.student.record.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.GeneralCertificateDAO;
import com.lzlz.student.record.entiy.GeneralCertificate;
import com.lzlz.student.record.service.GeneralCertificateService;

@Service("generalCertificateService")
public class GeneralCertificateServiceImpl implements GeneralCertificateService {
	private GeneralCertificateDAO generalCertificateDAO;

	@Autowired
	public void setGeneralCertificateDAO(GeneralCertificateDAO generalCertificateDAO) {
		this.generalCertificateDAO = generalCertificateDAO;
	}

	@Override
	public int insertByGeneralCertificate(GeneralCertificate generalCertificate) {
		return generalCertificateDAO.insertByGeneralCertificate(generalCertificate);
	}

	@Override
	public int insertByList(List<GeneralCertificate> list) {
		return generalCertificateDAO.insertByList(list);
	}

	@Override
	public int updateByGeneralCertificate(GeneralCertificate generalCertificate) {
		return generalCertificateDAO.updateByGeneralCertificate(generalCertificate);
	}

	@Override
	public int deleteByGcid(long gcid) {
		return generalCertificateDAO.deleteByGcid(gcid);
	}

	@Override
	public List<GeneralCertificate> selectByTno(long tno) {
		return generalCertificateDAO.selectByTno(tno);
	}

	@Override
	public GeneralCertificate selectByGcid(long gcid) {
		return generalCertificateDAO.selectByGcid(gcid);
	}

}
