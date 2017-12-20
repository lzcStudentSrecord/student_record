package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy._Class;

@Repository
public interface _ClassDAO {
	public int insertBy_Class(@Param("_class") _Class _class);

	public _Class selectByC_no(@Param("c_no") long c_no);

	public List<_Class> selectAll();

	public int updateBy_Class(@Param("_class") _Class _class);

	public int deleteByC_no(@Param("c_no") long c_no);
}
