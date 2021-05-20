package com.onemount.cgv.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity(name="event")
@Table(name="event")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cinema_id")
    private Cinema cinemas;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Cinema rooms;

    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film films;

    @Column(name = "start_date")
    @Temporal(TemporalType.TIMESTAMP)
    public Date startDate;

    @Column(name = "end_date")
    @Temporal(TemporalType.TIMESTAMP)
    public Date endDate;

    @Column(name = "status")
    private int status;

}
