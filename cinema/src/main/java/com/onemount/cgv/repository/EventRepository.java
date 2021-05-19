package com.onemount.cgv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onemount.cgv.model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
    
}
