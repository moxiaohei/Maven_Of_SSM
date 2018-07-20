package com.mxf.service;


import java.util.List;

import com.mxf.entity.Teacher;

public interface TeacherService {
	//	查找所有教师信息
	public List<Teacher> findAll();
}