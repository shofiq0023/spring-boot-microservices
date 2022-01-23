package com.studentlist.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.studentlist.models.StudentDetailModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentDetailService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getFallbackStudentDetail")
    public StudentDetailModel getStudentDetail(Integer studentId) {
        return restTemplate.getForObject("http://student-details-service/student/" + studentId, StudentDetailModel.class);
    }

    private StudentDetailModel getFallbackStudentDetail(Integer studentId) {
        return new StudentDetailModel(studentId, "Not found", "Not found");
    }
}
