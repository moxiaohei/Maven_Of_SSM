package com.mxf.dao;

import java.util.List;

import com.mxf.entity.Teacher;

public interface TeacherMapper {
	//	查找所有教师信息
	public List<Teacher> findAll();
}