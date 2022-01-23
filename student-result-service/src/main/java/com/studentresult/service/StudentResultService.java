package com.studentresult.service;

import com.studentresult.model.StudentResultModel;
import com.studentresult.repository.StudentResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentResultService {

    @Autowired
    private StudentResultRepository studentResultRepo;

    // add
    public void addResult(StudentResultModel result) {
        studentResultRepo.save(result);
    }

    // get single
    public Optional<StudentResultModel> getResult(Integer studentId) {
        return studentResultRepo.findById(studentId);
    }

    // update
    public void updateResult(Integer studentId, StudentResultModel result) {
        studentResultRepo.save(result);
    }

    // delete
    public void deleteResult(Integer studentId) {
        studentResultRepo.deleteById(studentId);
    }
}
