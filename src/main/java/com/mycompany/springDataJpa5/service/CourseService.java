package com.mycompany.springDataJpa5.service;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.springDataJpa5.model.Course;
import com.mycompany.springDataJpa5.repo.ICourseRepo;

@Service
public class CourseService implements ICourseService {
	
	@Autowired
	private ICourseRepo repo;

	@Override
	public List<Course> fetchByCourseName(String courseName) {
		// TODO Auto-generated method stub
		return repo.searchByCourseName(courseName);
	}

	@Override
	public List<Course> fetchByCourseNames(String courseName1, String courseName2) {
		// TODO Auto-generated method stub
		return repo.searchByCourseNames(courseName1, courseName2);
	}

	@Override
	public List<String> fetchByPrice(Double minCost, Double maxCost) {
		// TODO Auto-generated method stub
		return repo.searchByPrice(minCost, maxCost);
	}

	@Override
	public List<String> fetchByDurationGreaterThan(Integer duration) {
		// TODO Auto-generated method stub
		return repo.searchByDurationGreater(duration);
	}

	@Override
	public int updateTheCoursePrice(Double price, String courseName) {
		// TODO Auto-generated method stub
		return repo.updatePrice(price, courseName);
	}

	@Override
	public int deleteTheCourse(Integer id) {
		// TODO Auto-generated method stub
		return repo.deleteTheCourse(id);
	}

	@Override
	public int insertTheCourseData(Integer id, String name, Integer duration, Double price) {
		// TODO Auto-generated method stub
		return repo.insertCourseData(id, name, duration, price);
	}

	@Override
	public Date getSystemDate() {
		// TODO Auto-generated method stub
		return repo.getSystemDateAndTime();
	}

}
