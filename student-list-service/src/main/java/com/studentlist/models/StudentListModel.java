package com.studentlist.models;

public class StudentListModel {
    private Integer studentId;
    private String studentName;
    private String studentEmail;
    private double studentResult;

    public StudentListModel() {
    }

    public StudentListModel(Integer studentId, String studentName, String studentEmail, double studentResult) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentResult = studentResult;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public double getStudentResult() {
        return studentResult;
    }

    public void setStudentResult(double studentResult) {
        this.studentResult = studentResult;
    }
}
