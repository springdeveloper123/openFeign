package com.spring.student.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Student {

    private String name;
    private String location;
    private int id;
    private int classNo;
    private List<Course> courses;
    private Marks marks;

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }

    public Student(int id, String name, int classNo, String location) {
        super();
        this.name = name;
        this.location = location;
        this.id = id;
        this.classNo = classNo;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }    
    public List<Course> getCourses() {
        return courses;
    }
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
