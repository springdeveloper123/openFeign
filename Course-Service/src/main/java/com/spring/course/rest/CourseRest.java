package com.spring.course.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.course.model.Course;
import com.spring.course.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseRest {

    @Autowired
    CourseService courseService;

    @RequestMapping(value="/{classNo}", method=RequestMethod.GET)
    public List<Course> getCourse(@PathVariable("classNo") int classNo){
        List<Course> courses = courseService.getCourses(classNo);
    	System.out.println("getCourse method : "+ courses);
        return courses;
    }

    @RequestMapping(method=RequestMethod.GET)
    public List<Course> getAllCourses(){
    	List<Course> marksList = courseService.getAllCourses();
    	System.out.println("getAllCourses method : "+ marksList);
        return marksList;
    }
}
