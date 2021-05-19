package com.onemount.cgv.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity(name = "cinema")
@Table(name = "cinema")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cinema {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "city")
    private String city;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name ="cinema_id")
    private List<Room> rooms;
    

    @ManyToMany(mappedBy = "cinemas", fetch = FetchType.LAZY)
    private List<Event> events;
    
    @Column(name = "status")
    private String status;

    public Cinema(String name, String city, List<Room> rooms, List<Event> events, String status) {
        this.name = name;
        this.city = city;
        this.rooms = rooms;
        this.events = events;
        this.status = status;
    }

    public Cinema(String name, String city, List<Room> rooms, String status) {
    }



}
