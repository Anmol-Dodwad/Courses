package com.example.course.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entity.Course;
import com.example.course.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	CourseService courseService;

	
	@GetMapping("/courses")
	public ResponseEntity<List<Course>> getCourses(){
		
		List<Course> courses = null;
		HttpStatus httpStatus = HttpStatus.OK;
		System.out.println("hi");
		courses = courseService.getCourses();
		
		System.out.println(courses);
		if(courses==null) {
			httpStatus = HttpStatus.NO_CONTENT;
		}
		return new ResponseEntity<>(courses,httpStatus);
	}
	
	
	@PostMapping("/addCourses")
	public ResponseEntity<List<Course>> addCourses(@RequestBody List<Course> courses) {
		
		HttpStatus httpStatus = HttpStatus.CREATED;
		System.out.println(courses.toString());
		return new ResponseEntity<List<Course>>(courseService.addCourses(courses),httpStatus);
		
	}
	
	
	
}
