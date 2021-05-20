package com.onemount.cgv.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity(name = "cinema")
@Table(name = "cinema")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "city")
    private String city;

    @Column(name = "status")
    private String status;





}
