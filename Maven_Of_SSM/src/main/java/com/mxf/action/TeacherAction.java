package com.mxf.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mxf.entity.Teacher;
import com.mxf.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class TeacherAction extends ActionSupport {
	
    @Autowired
    private TeacherService teacherServcie;
    
    @Override
    public String execute() throws Exception {
    	System.out.println("Hello World");
    	return super.execute();
    }
    
    public String getAllTeacher() {
    	HttpServletRequest request = ServletActionContext.getRequest();
    	List<Teacher> list = teacherServcie.findAll();
    	request.setAttribute("list", list);
    	return SUCCESS;
    }

}