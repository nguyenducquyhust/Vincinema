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
import sun.security.krb5.internal.Ticket;

@Entity(name = "room")
@Table(name = "room")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

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
