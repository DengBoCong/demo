package com.example.demo.Entities;

/**
 * @program: demo
 * @description:
 * @author: DBC
 * @create: 2020-02-24 22:48
 **/
public class Department {
    private Integer id;
    private String departmentName;

    public Department() {
    }

    public Department(int i, String string) {
        this.id = i;
        this.departmentName = string;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
