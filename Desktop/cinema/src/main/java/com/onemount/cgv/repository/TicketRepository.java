package com.onemount.cgv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onemount.cgv.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long>{
    
}
