package com.mycompany.springDataJpa5.repo;

import java.util.Date;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mycompany.springDataJpa5.model.Course;

import jakarta.transaction.Transactional;

@Repository
public interface ICourseRepo extends JpaRepository<Course, Long> {
	
	// JPA Custom Query methods
//	@Query("FROM Course WHERE courseName=:courseName")
//	List<Course> searchByCourseName(String courseName);
	
	@Query("From Course where courseName=:courseName")
	public List<Course> searchByCourseName(@Param("courseName")String name);
	
	@Query("From Course where courseName in(:courseName1, :courseName2)")
	public List<Course> searchByCourseNames(String courseName1, String courseName2);
	
	@Query("Select courseName from Course where price between :minCost and :maxCost")
	public List<String> searchByPrice(Double minCost, Double maxCost);
	
	@Query("Select courseName from Course where duration > :duration")
	public List<String> searchByDurationGreater(Integer duration);
	
	@Transactional
	@Modifying
	@Query("Update Course set price=:newPrice where courseName=:courseName")
	public int updatePrice(Double newPrice, String courseName);
	
	@Transactional
	@Modifying
	@Query("Delete from Course where courseId=:id")
	public int deleteTheCourse(Integer id);
	
	@Transactional
	@Modifying
	@Query(value="Insert into Course(`course_id`,`course_name`,`duration`,`price`) Values(?,?,?,?)", nativeQuery=true)
	public int insertCourseData(Integer id, String name, Integer duration, Double price);
	
	@Query(value="Select now() from dual", nativeQuery = true)
	public Date getSystemDateAndTime();
	
	
}
