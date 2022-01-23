package com.studentlist.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.studentlist.models.StudentResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentResultService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getFallbackStudentResult")
    public StudentResult getStudentResult(Integer studentId) {
        return restTemplate.getForObject("http://student-result-service/student-result/" + studentId, StudentResult.class);
    }

    private StudentResult getFallbackStudentResult(Integer studentId) {
        return new StudentResult(studentId, 0);
    }

}
