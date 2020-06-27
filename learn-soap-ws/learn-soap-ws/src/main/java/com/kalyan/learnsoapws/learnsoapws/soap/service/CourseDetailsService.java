package com.kalyan.learnsoapws.learnsoapws.soap.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.kalyan.learnsoapws.learnsoapws.soap.bean.Course;

@Component
public class CourseDetailsService {
	
	public enum Status{
		SUCCESS,FAILURE;
	}
	
	private static List<Course> courses = new ArrayList<>();
	
	static {
		Course course1 = new Course(1,"Ramayana","Story of Rama");
		courses.add(course1);
		
		Course course2 = new Course(2,"Mahabharata","Story of Kurus");
		courses.add(course2);
		
		Course course3 = new Course(3,"Bhagavat Gita","Teachings of Krishna");
		courses.add(course3);
	}
	
	//findById()
	
	public static Course findById(int id) {
		
		for(Course course:courses) {
			
			if(course.getId() == id) {
				return course;
			}
			
		}
		return null;
	}
	//findAll()
	
	public static List<Course> findAll(){
		
		return courses;
	}
	//delete
	
	public static Status deleteById(int id) {
		
		Iterator<Course> iterator = courses.iterator();
		
		while(iterator.hasNext()) {
			Course course = iterator.next();
			if(course.getId() == id) {
				iterator.remove();
				return Status.SUCCESS;
			}
		}
		return Status.FAILURE;	
	}

}
