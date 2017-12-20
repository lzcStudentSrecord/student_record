package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.ProfessCertificate;

@Repository
public interface ProfessCertificateDAO {
	public int insertByProfessCertificate(@Param("professCertificate") ProfessCertificate professCertificate);

	public int insertByList(@Param("list") List<ProfessCertificate> list);

	public int updateByProfessCertificate(@Param("professCertificate") ProfessCertificate professCertificate);

	public int deleteByPcid(@Param("pcid") long pcid);

	public List<ProfessCertificate> selectBySnoWithAll(@Param("sno") long sno);

	public List<ProfessCertificate> selectByTnoWithNoPass(@Param("tno") long tno);

}
