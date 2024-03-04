package com.JDBC_Practice.Spring_JDBC_Demo.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int id;
    private String name;
    private String Department;

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

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

}
