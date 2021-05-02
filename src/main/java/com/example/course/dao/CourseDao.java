package com.example.course.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.course.entity.Course;

@Repository
public interface CourseDao extends JpaRepository<Course,Long> {
	
	
}
