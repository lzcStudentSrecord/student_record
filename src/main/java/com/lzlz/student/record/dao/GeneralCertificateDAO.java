package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.GeneralCertificate;

@Repository
public interface GeneralCertificateDAO {
	public int insertByGeneralCertificate(@Param("generalCertificate") GeneralCertificate generalCertificate);

	public int insertByList(@Param("list") List<GeneralCertificate> list);

	public int updateByGeneralCertificate(@Param("generalCertificate") GeneralCertificate generalCertificate);

	public int deleteByGcid(long gcid);

	public List<GeneralCertificate> selectByTno(long tno);
}
