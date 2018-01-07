package com.lzlz.student.record.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lzlz.student.record.entiy.GeneralCertificate;

@Service
public interface GeneralCertificateService {
	public int insertByGeneralCertificate(GeneralCertificate generalCertificate);

	public int insertByList(List<GeneralCertificate> list);

	public int updateByGeneralCertificate(GeneralCertificate generalCertificate);

	public int deleteByGcid(long gcid);

	public List<GeneralCertificate> selectByTno(long tno);
	
	public GeneralCertificate selectByGcid(long gcid);
}
