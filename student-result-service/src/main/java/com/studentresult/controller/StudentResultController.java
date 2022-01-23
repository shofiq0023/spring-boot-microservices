package com.studentresult.controller;

import com.studentresult.model.StudentResultModel;
import com.studentresult.service.StudentResultService;
import org.bouncycastle.its.asn1.IValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/student-result")
public class StudentResultController {

    @Autowired
    private StudentResultService resultService;

    // add operation
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addResult(@RequestBody StudentResultModel result) {
        resultService.addResult(result);
    }

    // read single operation
    @RequestMapping("/{studentId}")
    public Optional<StudentResultModel> getStudent(@PathVariable("studentId") Integer studentId) {
        return resultService.getResult(studentId);
    }

    // update operation
    @RequestMapping(value = "/update/{studentId}", method = RequestMethod.PUT)
    public void updateResult(@PathVariable("studentId") Integer studentId, @RequestBody StudentResultModel result) {
        resultService.updateResult(studentId, result);
    }

    // delete operation
    @RequestMapping(value = "/delete/{studentId}", method = RequestMethod.DELETE)
    public void deleteResult(@PathVariable("studentId") Integer studentId) {
        resultService.deleteResult(studentId);
    }
}
