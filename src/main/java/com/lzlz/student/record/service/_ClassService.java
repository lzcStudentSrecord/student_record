package com.lzlz.student.record.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lzlz.student.record.entiy._Class;

@Service
public interface _ClassService {
	public int insertBy_Class(_Class _class);

	public _Class selectByC_no(long c_no);

	public List<_Class> selectAll();

	public int updateBy_Class(_Class _class);

	public int deleteByC_no(long c_no);
}
