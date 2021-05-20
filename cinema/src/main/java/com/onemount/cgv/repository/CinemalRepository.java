package com.onemount.cgv.repository;

import com.onemount.cgv.model.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemalRepository extends JpaRepository<Cinema, Long> {

}
