package com.studentlist.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.studentlist.models.StudentDetailList;
import com.studentlist.models.StudentDetailModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class StudentListService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getFallbackStudentList")
    public StudentDetailList getAllStudents() {
        return restTemplate.getForObject("http://student-details-service/student/all", StudentDetailList.class);
    }

    private StudentDetailList getFallbackStudentList() {
        StudentDetailList studentDetailList = new StudentDetailList();
        studentDetailList.setStudents(Arrays.asList(
                new StudentDetailModel(0, "Not found", "Not found")
        ));
        return studentDetailList;
    }

}
