package com.onemount.cgv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "order_line")
@Table(name = "order_line")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLine {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY) @MapsId
    @PrimaryKeyJoinColumn
    private Ticket ticket;

    @Column(name = "seat_no")
    private int seatNo;
}
