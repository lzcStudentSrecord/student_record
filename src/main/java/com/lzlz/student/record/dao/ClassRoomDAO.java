package com.lzlz.student.record.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzlz.student.record.entiy.ClassRoom;

@Repository
public interface ClassRoomDAO {
	public int insertByClassRoom(@Param("classRoom") ClassRoom classRoom);

	public int updateByClassRoom(@Param("classRoom") ClassRoom classRoom);
	
	public List<ClassRoom> selectAll();
}
