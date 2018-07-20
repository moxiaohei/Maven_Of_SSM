package com.mxf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mxf.dao.TeacherMapper;
import com.mxf.entity.Teacher;
import com.mxf.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	private TeacherMapper teacherMapper;

	@Override
	public List<Teacher> findAll() {
		List<Teacher> list = teacherMapper.findAll();
		return list;
	}

}