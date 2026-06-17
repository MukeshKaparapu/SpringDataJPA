package com.mycompany.springDataJpa5;


import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mycompany.springDataJpa5.service.ICourseService;

@SpringBootApplication
public class SpringDataJpa5Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa5Application.class, args);
		
		ICourseService service = container.getBean(ICourseService.class);
		
		service.fetchByCourseName("Hibernate").forEach(course1 -> System.out.println(course1));
		
		System.out.println("**********************");
		
		service.fetchByCourseNames("DSA", "Devops").forEach(course2 -> System.out.println(course2));
		
		System.out.println("**********************");
		
		service.fetchByPrice(1500.0, 3000.0).forEach(course3 -> System.out.println(course3));
		
		System.out.println("***********************");
		
		service.fetchByDurationGreaterThan(90).forEach(course4->System.out.println(course4));
		
		System.out.println("************************");
		
		int rows = service.updateTheCoursePrice(999.0, "Hibernate");
		System.out.println("no.of rows updated:"+rows);
		
		System.out.println("***************************");
		
		int rowsDeleted = service.deleteTheCourse(7);
		System.out.println("no.of rows deleted:"+rowsDeleted);
		
		System.out.println("****************************");
		
		int rowsInserted = service.insertTheCourseData(7, "AWS", 60, 1799.0);
		System.out.println("No.of rows inserted:"+rowsInserted);
		
		Date date = service.getSystemDate();
		System.out.println(date);
		
	}

}
