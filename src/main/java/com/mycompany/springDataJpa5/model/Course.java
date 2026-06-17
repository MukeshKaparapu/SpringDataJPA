package com.mycompany.springDataJpa5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int courseId;
	private String courseName;
	private int duration;
	private double price;
	
	public Course() {
		super();
	}

	public Course(String courseName, int duration, double price) {
		super();
		this.courseName = courseName;
		this.duration = duration;
		this.price = price;
	}

	public Course(int courseId, String courseName, int duration, double price) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.price = price;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + ", price="
				+ price + "]";
	}
	
}
