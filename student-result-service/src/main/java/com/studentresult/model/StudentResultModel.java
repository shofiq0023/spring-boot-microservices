package com.studentresult.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studentResult")
public class StudentResultModel {

    @Id
    @Column(name = "studentId")
    private Integer studentId;

    @Column(name = "studentResult")
    private double studentResult;

    public StudentResultModel() {
    }

    public StudentResultModel(double studentResult) {
        this.studentResult = studentResult;
    }

    public StudentResultModel(Integer studentId, double studentResult) {
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
