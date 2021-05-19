package com.onemount.cgv.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="event")
@Table(name="event")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {

@Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany
    @JoinTable(
            name = "event_cinema",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "cinema_id")
    )
    private List<Cinema> cinemas;

    @ManyToMany
    @JoinTable(
            name = "event_room",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "room_id")
    )
    private List<Cinema> rooms;

    @ManyToMany
    @JoinTable(
            name = "event_film",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id")
    )
    private List<Film> films;

    @Column(name = "start_date")
    @Temporal(TemporalType.TIMESTAMP)
    public Date startDate;

    @Column(name = "end_date")
    @Temporal(TemporalType.TIMESTAMP)
    public Date endDate;

    @Column(name = "status")
    private int status;

    public Event(List<Cinema> cinemas1, List<Room> rooms1, List<Film> films1, String string, String string2, int i) {
}

}
