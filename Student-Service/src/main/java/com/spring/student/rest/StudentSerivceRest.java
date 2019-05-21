package com.spring.student.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.student.model.Course;
import com.spring.student.model.Student;
import com.spring.student.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentSerivceRest {
	
    @Autowired
    StudentService studentService;

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Student getStudentDetails(@PathVariable("id") int id){
    	Student student = studentService.getStudentDetails(id);
    	System.out.println("getStudentDetails method : "+ student.toString());
        return student;
    }

    @RequestMapping(method=RequestMethod.GET)
    public List<Student> getAllStudentDetails(){
    	List<Student> students = studentService.getAllStudentDetails();
    	System.out.println("getAllStudentDetails method : "+ students);
        return students;
    }

    @RequestMapping(value="/course/{id}", method=RequestMethod.GET)
    public Student getStudentCoursedetails(@PathVariable("id") int id){
    	Student student = studentService.getStudentCoursedetails(id);
    	System.out.println("getStudentCoursedetails method : "+student);
        return student;
    }
    
    @RequestMapping(value="/course/marks/{id}", method=RequestMethod.GET)
    public Student getStudentCourseWithMarks(@PathVariable("id") int id){
        Student student = studentService.getStudentCourseWithMarks(id);
        System.out.println("getStudentCourseWithMarks method : "+student);
        return student;
    }
    
    @RequestMapping(value="/courses", method=RequestMethod.GET)
    public List<Course> getAllCourses(){
        List<Course> courses = studentService.getAllCourses();
        System.out.println("getAlltCourses method : "+courses);
        return courses;
    }
}
