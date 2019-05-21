package com.spring.student.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.student.config.ClientConfiguration;
import com.spring.student.model.Course;

@FeignClient(value = "course", url = "http://localhost:8090/", configuration = ClientConfiguration.class)
public interface CourseClient {
    
    @RequestMapping(method = RequestMethod.GET, value = "/course")
    List<Course> getAllCourses();
    
    @RequestMapping(method = RequestMethod.GET, value = "/course/{classNo}")
    List<Course> getCourse(@PathVariable("classNo") int classNo);
    
}