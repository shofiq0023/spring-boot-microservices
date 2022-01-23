package com.studentdetails.repository;

import com.studentdetails.model.StudentModel;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentModel, Integer> {

}
