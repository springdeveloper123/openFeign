package com.spring.student.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.student.client.CourseClient;
import com.spring.student.client.StudentResultsClient;
import com.spring.student.model.Course;
import com.spring.student.model.Marks;
import com.spring.student.model.Student;
@Service
public class StudentService {

    @Autowired
    CourseClient client;
    
    @Autowired
    StudentResultsClient resultsClient;
    
    private static final Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
    static {
        studentMap.put(1, new Student(1,"Arun", 1, "AP"));
        studentMap.put(2, new Student(2,"Ajay", 3, "AP"));
        studentMap.put(3, new Student(3,"Ben", 6, "TN"));
        studentMap.put(4, new Student(4,"Balu", 5, "TN"));
        studentMap.put(5, new Student(5,"chetan", 2, "KA"));
        studentMap.put(6, new Student(6,"dallas", 8, "KA"));
        studentMap.put(7, new Student(7,"allen", 4, "TA"));
        studentMap.put(8, new Student(8,"norries", 7, "TA"));
        studentMap.put(9, new Student(9,"vyom", 4, "UP"));
        studentMap.put(10, new Student(10,"kumar", 2, "UP"));
    }

    public Student getStudentDetails(int id) {
    	if (studentMap.containsKey(id)) 
    		return studentMap.get(id);
    	else
    		throw new RuntimeException("No Record found.");
    }

    public List<Student> getAllStudentDetails() {
        List<Student> students =  new ArrayList<Student>();
        students.addAll(studentMap.values());
        return students;
    }

    public Student getStudentCoursedetails(int id) {
    	Student student = studentMap.get(id);
        List<Course> courses = client.getCourse(student.getClassNo());
        student.setCourses(courses);
        return student;
    }
    
    public List<Course> getAllCourses() {
        return client.getAllCourses();
    }
    
    public Student getStudentCourseWithMarks(int id) {
        Student student = studentMap.get(id);
        List<Course> courses = client.getCourse(student.getClassNo());
        student.setCourses(courses);
        Marks marks = resultsClient.getMarks(id);
        student.setMarks(marks);
        return student;
    }
}