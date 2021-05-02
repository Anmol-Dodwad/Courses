package com.example.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.dao.CourseDao;
import com.example.course.entity.Course;

@Service
public class CourseService {
	
	@Autowired
	CourseDao courseDao;
	

	public List<Course> getCourses() { 
		List<Course> courses = courseDao.findAll();
		
		if(courses.isEmpty()) {
			courses=null; 
		}
		return courses;
	}

	public List<Course> addCourses(List<Course> courses) {
		
		System.out.println(courses);
		courseDao.saveAll(courses);
		
		return courses;
	}

}
