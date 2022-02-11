package com.codeclan.example.EmployeeTracker.models;

import javax.persistence.*;

@Entity

@Table(name = "employee")



public class Employee{
    @Column(name = "full_name")
    private String name;
    @Column(name= "age")
    private int age;
    @Column(name = "employeeNumber")
    private int employeeNumber;
    @Column(name = "email")
    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    public Employee(String name, int age, int employeeNumber, String email){
        this.name = name;
        this.age = age;
        this.employeeNumber = employeeNumber;
        this.email = email;
    }
    public Employee(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
