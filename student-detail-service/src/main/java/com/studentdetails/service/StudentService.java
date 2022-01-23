package com.studentdetails.service;

import com.studentdetails.model.StudentModel;
import com.studentdetails.model.StudentModelList;
import com.studentdetails.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;

    // create
    public void addStudent(StudentModel student) {
        studentRepo.save(student);
    }

    // read all
    public StudentModelList getAll() {
        List<StudentModel> students = new ArrayList<>();
        studentRepo.findAll().forEach(students::add);

        StudentModelList studentList = new StudentModelList();
        studentList.setStudents(students);
        return studentList;
    }

    // read single
    public Optional<StudentModel> getStudent(Integer studentId) {
        return studentRepo.findById(studentId);
    }

    // update
    public void updateStudent(Integer studentId, StudentModel student) {
        studentRepo.save(student);
    }

    // delete
    public void deleteStudent(Integer studentId) {
        studentRepo.deleteById(studentId);
    }

}
