package com.fis.sample.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.fis.sample.models.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{
	List<Customer> findByLastName(String lastName);
}
