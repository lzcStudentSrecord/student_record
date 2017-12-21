package com.lzlz.student.record.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.Admin;

@Repository
public interface AdminDAO {
	/**
	 * 通过用户名查询一条数据并封装到对象中
	 * 
	 * @param username
	 *            管理员用户名
	 * @return 关系映射的对象
	 */
	public Admin selectByUsername(@Param("username") String username);

	/**
	 * 通过admin对象修改数据
	 * 
	 * @param admin
	 *            关系映射的对象
	 * @return 结果码
	 */
	public int updateByAdmin(@Param("admin") Admin admin);
}
