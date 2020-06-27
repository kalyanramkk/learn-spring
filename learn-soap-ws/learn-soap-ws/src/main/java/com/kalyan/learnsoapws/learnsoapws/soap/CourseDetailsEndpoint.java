package com.kalyan.learnsoapws.learnsoapws.soap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.Namespace;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.kalyan.courses.CourseDetails;
import com.kalyan.courses.DeleteCoursByIdRequest;
import com.kalyan.courses.DeleteCourseDetailsRequest;
import com.kalyan.courses.DeleteCourseDetailsResponse;
import com.kalyan.courses.GetAllCourseDetailsRequest;
import com.kalyan.courses.GetAllCourseDetailsResponse;
import com.kalyan.courses.GetCourseDetailsRequest;
import com.kalyan.courses.GetCourseDetailsResponse;
import com.kalyan.learnsoapws.learnsoapws.soap.bean.Course;
import com.kalyan.learnsoapws.learnsoapws.soap.exception.CourseNotFoundException;
import com.kalyan.learnsoapws.learnsoapws.soap.service.CourseDetailsService;
import com.kalyan.learnsoapws.learnsoapws.soap.service.CourseDetailsService.Status;

@Endpoint
public class CourseDetailsEndpoint {
	
	@Autowired
	CourseDetailsService service;
	
	
	@PayloadRoot(namespace="http://kalyan.com/courses", 
			localPart = "GetCourseDetailsRequest")
	@ResponsePayload
	public GetCourseDetailsResponse 
		processCourseDetailsRequest(@RequestPayload GetCourseDetailsRequest request) {
		Course course = service.findById(request.getId());
		
		if(course==null) {
			throw new CourseNotFoundException("No courses available with id"+request.getId());
		}
		
		return mapCourseDetails(course);
		
	}
	
	@PayloadRoot(namespace="http://kalyan.com/courses", 
			localPart = "GetAllCourseDetailsRequest")
	@ResponsePayload
	public GetAllCourseDetailsResponse 
		processAllCourseDetailsRequest(@RequestPayload GetAllCourseDetailsRequest request) {
		List<Course> course = service.findAll();
		
		return mapAllCourseDetails(course);
		
	}
	
	@PayloadRoot(namespace="http://kalyan.com/courses", 
			localPart = "DeleteCourseDetailsRequest")
	@ResponsePayload
	public DeleteCourseDetailsResponse 
		deleteCourseDetailsRequest(@RequestPayload DeleteCourseDetailsRequest request) {
		Status status = service.deleteById(request.getId());
		
		DeleteCourseDetailsResponse response = new DeleteCourseDetailsResponse();
		response.setStatus(mapStatus(status));
		return response;
	}
	
	
	
	
	private com.kalyan.courses.Status mapStatus(Status status) {
		// TODO Auto-generated method stub
		if(status == Status.FAILURE)
			return com.kalyan.courses.Status.FAILURE;
		return com.kalyan.courses.Status.SUCCESS;
	}

	private GetCourseDetailsResponse mapCourseDetails(Course course) {
		GetCourseDetailsResponse response = new GetCourseDetailsResponse();
		response.setCourseDetails(mapCourse(course));
		
		return response;
	}
	
	private GetAllCourseDetailsResponse mapAllCourseDetails(List<Course> courses) {
		GetAllCourseDetailsResponse response = new GetAllCourseDetailsResponse();
		for(Course course:courses) {
			
			CourseDetails courseDetails = mapCourse(course);
			response.getCourseDetails().add(courseDetails);
			
			
		}
		
		
		return response;
	}



	private CourseDetails mapCourse(Course course) {
		
		CourseDetails courseDetails = new CourseDetails();
		courseDetails.setId(course.getId());
		courseDetails.setName(course.getName());
		courseDetails.setDescription(course.getDescription());
		
		return courseDetails;
	}

}
