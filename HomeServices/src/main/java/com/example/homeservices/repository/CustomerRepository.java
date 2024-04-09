package com.example.homeservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.homeservices.model.Customer;



@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

	Customer findByEmailAndPassword(String email, String password);

	Customer findByEmail(String email);

	
}
