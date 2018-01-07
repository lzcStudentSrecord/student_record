package com.lzlz.student.record.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.ProfessCertificateDAO;
import com.lzlz.student.record.entiy.ProfessCertificate;
import com.lzlz.student.record.service.ProfessCertificateService;

@Service("professCertificateService")
public class ProfessCertificateServiceImpl implements ProfessCertificateService {
	private ProfessCertificateDAO professCertificateDAO;

	@Autowired
	public void setProfessCertificateDAO(ProfessCertificateDAO professCertificateDAO) {
		this.professCertificateDAO = professCertificateDAO;
	}

	@Override
	public int insertByProfessCertificate(ProfessCertificate professCertificate) {
		return professCertificateDAO.insertByProfessCertificate(professCertificate);
	}

	@Override
	public int insertByList(List<ProfessCertificate> list) {
		return professCertificateDAO.insertByList(list);
	}

	@Override
	public int updateByProfessCertificate(ProfessCertificate professCertificate) {
		return professCertificateDAO.updateByProfessCertificate(professCertificate);
	}

	@Override
	public int deleteByPcid(long pcid) {
		return professCertificateDAO.deleteByPcid(pcid);
	}

	@Override
	public List<ProfessCertificate> selectByTnoWithNoPass(long tno) {
		return professCertificateDAO.selectByTnoWithNoPass(tno);
	}

	@Override
	public List<ProfessCertificate> selectBySnoWithAll(long sno) {
		return professCertificateDAO.selectBySnoWithAll(sno);
	}

	@Override
	public ProfessCertificate selectByPcid(long pcid) {
		return professCertificateDAO.selectByPcid(pcid);
	}

	@Override
	public List<ProfessCertificate> selectByTnoWithHadPass(long tno) {
		return professCertificateDAO.selectByTnoWithHadPass(tno);
	}

}
