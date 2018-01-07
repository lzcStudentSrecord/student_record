package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.ProfessCertificate;

@Repository
public interface ProfessCertificateDAO {
	/**
	 * 通过ProfessCertificate添加一条数据
	 * 
	 * @param professCertificate
	 *            关系映射的对象
	 * @return 结果码
	 */
	public int insertByProfessCertificate(@Param("professCertificate") ProfessCertificate professCertificate);

	/**
	 * 通过集合添加多条数据
	 * 
	 * @param list
	 *            集合
	 * @return 结果码(select LAST_INSERT())
	 */
	public int insertByList(@Param("list") List<ProfessCertificate> list);

	/**
	 * 通过ProfessCertificate对象修改数据
	 * 
	 * @param professCertificate
	 *            关系映射的对象
	 * @return 结果码
	 */
	public int updateByProfessCertificate(@Param("professCertificate") ProfessCertificate professCertificate);

	/**
	 * 通过专业证书编号删除一条数据
	 * 
	 * @param crid
	 *            专业证书编号的编号
	 * @return 删除的个数
	 */
	public int deleteByPcid(@Param("pcid") long pcid);

	/**
	 * 通过学生编号查询所有的数据
	 * 
	 * @param sno
	 *            学生编号
	 * @return 数据集合
	 */
	public List<ProfessCertificate> selectBySnoWithAll(@Param("sno") long sno);

	public List<ProfessCertificate> selectByTnoWithHadPass(@Param("tno") long tno);
	/**
	 * 通过老师编号查询所有未申请通过的数据
	 * 
	 * @param tno
	 *            老师编号
	 * @return 数据集合
	 */
	public List<ProfessCertificate> selectByTnoWithNoPass(@Param("tno") long tno);

	/**
	 * 通过记录编号删除一条数据
	 * 
	 * @param pcid
	 *            记录编号
	 * @return
	 */
	public ProfessCertificate selectByPcid(@Param("pcid") long pcid);

}
