package com.onemount.cgv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "ticket")
@Table(name = "ticket")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {

  @Id @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @OneToOne(fetch = FetchType.LAZY) @MapsId
  private Event event;

  @OneToOne(fetch = FetchType.LAZY) @MapsId
  private Customer customer;

  // @OneToMany(fetch = FetchType.LAZY)
  // private Transaction transaction;

  @Column(name = "price")
    private float price;

}
