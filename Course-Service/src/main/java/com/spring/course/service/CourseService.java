package com.spring.course.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.spring.course.model.Course;

@Service
public class CourseService {

    private static final Map<Integer, Course> coursesMap = new HashMap<>();
    static {
        coursesMap.put(1, new Course(101, "English", false));
        coursesMap.put(2, new Course(102, "Hindhi", true));
        coursesMap.put(3, new Course(103, "Maths", false));
        coursesMap.put(4, new Course(104, "Science", false));
        coursesMap.put(5, new Course(105, "Social", false));
        coursesMap.put(6, new Course(106, "French", true));
        
    }

    public List<Course> getCourses(int classNo) {
        List<Course> courses = new ArrayList<>();
        switch(classNo) {
            case 1:
                courses.add(coursesMap.get(1));
                courses.add(coursesMap.get(2));
                courses.add(coursesMap.get(3));
                break;
            case 2:
                courses.add(coursesMap.get(1));
                courses.add(coursesMap.get(2));
                courses.add(coursesMap.get(3));
                courses.add(coursesMap.get(4));
                break;
            case 3:
            case 4:  
                courses.add(coursesMap.get(1));
                courses.add(coursesMap.get(2));
                courses.add(coursesMap.get(3));
                courses.add(coursesMap.get(4));
                courses.add(coursesMap.get(5));
                break;                
            default :
                courses.add(coursesMap.get(1));
                courses.add(coursesMap.get(2));
                courses.add(coursesMap.get(3));
                courses.add(coursesMap.get(4));
                courses.add(coursesMap.get(5));
                courses.add(coursesMap.get(6));
        }
                
        return courses;
    }

    public List<Course> getAllCourses() {
        List<Course> courses =  new ArrayList<>();
        courses.addAll(coursesMap.values());
        return courses;
    }
    
}
