package com.spring.course.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Course {

    private int id;
    private String name;
    private boolean isLab;

    public Course(int id, String name, boolean isLab) {
        this.id = id;
        this.name = name;
        this.isLab = isLab;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLab() {
        return isLab;
    }

    public void setLab(boolean isLab) {
        this.isLab = isLab;
    }
}