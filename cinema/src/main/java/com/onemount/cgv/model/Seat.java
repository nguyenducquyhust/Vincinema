package com.onemount.cgv.model;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "seat")
@Table(name = "seat")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seat {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "seat_no")
    private int seatNo;

    @ManyToOne(fetch = FetchType.LAZY)
    private Room room;

    @OneToOne(mappedBy = "seat", cascade = CascadeType.ALL, orphanRemoval = true)
    @PrimaryKeyJoinColumn
    private Reservation reservation;

    @Column(name = "status")
    private String status;

}
