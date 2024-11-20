package com.example.EmployeeProject.model;

public class EmployeeRequest {
   private Integer key;
   private Employee employee;

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
