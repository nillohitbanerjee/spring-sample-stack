package com.fis.sample.repository;

import org.springframework.data.repository.CrudRepository;

import com.fis.sample.models.Student;
import com.fis.sample.models.Subject;

public interface SubjectRepository extends CrudRepository<Subject, Long>{

}