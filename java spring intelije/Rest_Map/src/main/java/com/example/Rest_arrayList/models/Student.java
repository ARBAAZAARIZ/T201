package com.example.Rest_arrayList.models;

public class Student {
    private int rollNumber;
    private String name;
    private char Section;
    private String grades;

    public Student(){

    }

    public Student(int rollNumber, String name, char section, String grades) {
        this.rollNumber = rollNumber;
        this.name = name;
        Section = section;
        this.grades = grades;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSection() {
        return Section;
    }

    public void setSection(char section) {
        Section = section;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }
}
