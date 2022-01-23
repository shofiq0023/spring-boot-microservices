package com.studentresult.repository;

import com.studentresult.model.StudentResultModel;
import org.springframework.data.repository.CrudRepository;

public interface StudentResultRepository extends CrudRepository<StudentResultModel, Integer> {
}
