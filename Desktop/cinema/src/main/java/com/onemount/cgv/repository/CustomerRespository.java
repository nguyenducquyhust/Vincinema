package com.onemount.cgv.repository;

import com.onemount.cgv.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import com.onemount.cgv.model.Customer;

public interface CustomerRespository extends JpaRepository<Customer, Long> {
    
}
