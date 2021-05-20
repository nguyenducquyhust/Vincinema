package com.onemount.cgv.controller;

import com.onemount.cgv.model.Cinema;
import com.onemount.cgv.service.CinemalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/admin/cgv")
public class CinemalController {

    @Autowired
    private CinemalService cinemalService;

    @PostMapping("/cinemal")
    private Cinema save(@RequestBody Cinema cinema)
    {
        return  cinemalService.save(cinema);
    }
}
