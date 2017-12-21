package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.GeneralCertificate;

@Repository
public interface GeneralCertificateDAO {
	/**
	 * 通过GeneralCertificate添加一条数据
	 * 
	 * @param generalCertificate
	 *            关系映射的对象
	 * @return 结果码
	 */
	public int insertByGeneralCertificate(@Param("generalCertificate") GeneralCertificate generalCertificate);

	/**
	 * 通过集合添加多条数据
	 * 
	 * @param list
	 *            集合
	 * @return 结果码(select LAST_INSERT())
	 */
	public int insertByList(@Param("list") List<GeneralCertificate> list);

	/**
	 * 通过GeneralCertificate对象修改数据
	 * 
	 * @param generalCertificate
	 *            关系映射的对象
	 * @return 结果码
	 */
	public int updateByGeneralCertificate(@Param("generalCertificate") GeneralCertificate generalCertificate);

	/**
	 * 通过证书编号删除一条数据
	 * 
	 * @param crid
	 *            通报批评的编号
	 * @return 删除的个数
	 */
	public int deleteByGcid(long gcid);

	/**
	 * 通过老师编号查询所有的数据
	 * 
	 * @param tno
	 *            老师编号
	 * @return 数据集合
	 */
	public List<GeneralCertificate> selectByTno(long tno);
}
