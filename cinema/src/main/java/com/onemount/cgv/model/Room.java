package com.onemount.cgv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;

import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "room")
@Table(name = "room")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {

    public Room(String string, String string2, String string3, String string4, String string5, String string6) {
    }

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @MapsId @OneToOne(fetch = FetchType.LAZY)
    private Ticket ticket;

    @Column(name = "room_no")
    private int roomNo;

    @Column(name = "number_seat")
    private int numberSeat;

    @Column(name = "projectors")
    private String projectors;

    @Column(name = "cinema_speaker")
    private String cinemaSpeaker;

    @Column(name = "acreage")
    private String acreage;

    @Column(name = "status")
    private String status;
}
