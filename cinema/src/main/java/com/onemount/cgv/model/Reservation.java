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

@Entity(name = "reservation")
@Table(name = "reservation")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @MapsId @OneToOne(fetch = FetchType.LAZY)
    private Seat seat;

    @Column(name = "reserved_time")
    private long reservedTime; // timestamp
}
