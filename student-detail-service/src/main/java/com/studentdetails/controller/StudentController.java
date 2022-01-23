package com.studentdetails.controller;

import com.studentdetails.model.StudentModel;
import com.studentdetails.model.StudentModelList;
import com.studentdetails.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // adds a new student
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addStudent(@RequestBody StudentModel student) {
        studentService.addStudent(student);
    }

    // gets all student
    @RequestMapping("/all")
    public StudentModelList getAll() {
        return studentService.getAll();
    }

    // gets a single student
    @RequestMapping("/{studentId}")
    public Optional<StudentModel> getStudent(@PathVariable("studentId") Integer studentId) {
        return studentService.getStudent(studentId);
    }

    // updates a student
    @RequestMapping(value = "/update/{studentId}", method = RequestMethod.PUT)
    public void updateStudent(@PathVariable("studentId") Integer studentId, @RequestBody StudentModel student) {
        studentService.updateStudent(studentId, student);
    }

    // deletes a student
    @RequestMapping(value = "/delete/{studentId}", method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable("studentId") Integer studentId) {
        studentService.deleteStudent(studentId);
    }

}
