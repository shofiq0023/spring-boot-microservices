package com.studentlist.models;

public class StudentResult {
    private Integer studentId;
    private double studentResult;

    public StudentResult() {
    }

    public StudentResult(Integer studentId, double studentResult) {
        this.studentId = studentId;
        this.studentResult = studentResult;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public double getStudentResult() {
        return studentResult;
    }

    public void setStudentResult(double studentResult) {
        this.studentResult = studentResult;
    }
}
