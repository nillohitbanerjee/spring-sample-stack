package com.fis.sample.repository;

import org.springframework.data.repository.CrudRepository;

import com.fis.sample.models.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{

}
