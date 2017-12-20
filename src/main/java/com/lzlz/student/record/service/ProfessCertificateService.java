package com.lzlz.student.record.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lzlz.student.record.entiy.ProfessCertificate;

@Service
public interface ProfessCertificateService {
	public int insertByProfessCertificate(ProfessCertificate professCertificate);

	public int insertByList(List<ProfessCertificate> list);

	public int updateByProfessCertificate(ProfessCertificate professCertificate);

	public int deleteByPcid(long pcid);

	public List<ProfessCertificate> selectBySnoWithAll(long sno);
	
	public List<ProfessCertificate> selectByTnoWithNoPass(long tno);

}
