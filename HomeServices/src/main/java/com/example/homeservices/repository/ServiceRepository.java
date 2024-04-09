package com.example.homeservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.homeservices.model.HomeServices;

@Repository
public interface ServiceRepository extends JpaRepository<HomeServices,Long>{

}
