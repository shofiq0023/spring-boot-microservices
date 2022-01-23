package com.studentlist.controller;

import com.studentlist.models.StudentDetailList;
import com.studentlist.models.StudentDetailModel;
import com.studentlist.models.StudentListModel;
import com.studentlist.models.StudentResult;
import com.studentlist.services.StudentDetailService;
import com.studentlist.services.StudentListService;
import com.studentlist.services.StudentResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/student-list")
public class StudentListController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private StudentDetailService studentDetailService;

    @Autowired
    private StudentResultService studentResultService;

    @Autowired
    private StudentListService studentListService;

    public StudentListController() {
    }

    // gets a single student
    @RequestMapping("/{studentId}")
    public StudentListModel getStudent(@PathVariable("studentId") Integer studentId) {
        StudentDetailModel student = studentDetailService.getStudentDetail(studentId);
        StudentResult result = studentResultService.getStudentResult(studentId);

        return student != null ? new StudentListModel(student.getStudentId(), student.getStudentName(), student.getStudentEmail(), result != null ? result.getStudentResult() : 0) : null;
    }

    // gets a list of student
    @RequestMapping("/all")
    public List<StudentListModel> getAll() {
        StudentDetailList students = studentListService.getAllStudents();

        return students != null ? students.getStudents().stream().map(student -> {
            StudentResult result = studentResultService.getStudentResult(student.getStudentId());
            return new StudentListModel(student.getStudentId(), student.getStudentName(), student.getStudentEmail(), result != null ? result.getStudentResult() : 0);
        }).collect(Collectors.toList()) : null;
    }



}
