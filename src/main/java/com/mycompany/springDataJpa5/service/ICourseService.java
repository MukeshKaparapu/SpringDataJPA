package com.mycompany.springDataJpa5.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mycompany.springDataJpa5.model.Course;


@Service
public interface ICourseService {
	
	public List<Course> fetchByCourseName(String courseName);
	public List<Course> fetchByCourseNames(String courseName1, String courseName2);
	public List<String> fetchByPrice(Double minCost, Double maxCost);
	public List<String> fetchByDurationGreaterThan(Integer duration);
	public int updateTheCoursePrice(Double price, String courseName);
	public int deleteTheCourse(Integer id);
	public int insertTheCourseData(Integer id, String name, Integer duration, Double price);
	public Date getSystemDate();
	
}
