package com.onemount.cgv.service;

import com.onemount.cgv.model.Cinema;
import com.onemount.cgv.repository.CinemalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.logging.Level;

@Service
public class CinemalService {
    @Autowired
    private CinemalRepository cinemalRepository;

    public Cinema save(Cinema cinema) {
        try {
            return cinemalRepository.save(cinema);
        } catch (Exception ex) {
            return null;
        }
    }
}
