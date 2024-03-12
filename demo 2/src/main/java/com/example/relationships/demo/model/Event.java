package com.example.relationships.demo.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;

@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eventId;

    @Column(name = "date")
    private Date date;
    @Column(name = "location")
    private String location;
    @Column(name = "duration")
    private int duration;
    @Column(name = "title")
    private String title;

    @OneToMany(mappedBy = "event")
    private HashSet<Guest> guestList = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "guest_name")
    private Guest guest;
    @ManyToOne
    @JoinColumn(name = "speaker_name")
    private Speaker speaker;

    public Event(Date date, String location,int duration, String title, HashSet<Guest> guestList) {
        setDate(date);
        setLocation(location);
        setDuration(duration);
        setTitle(title);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public HashSet<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(HashSet<Guest> guestList) {
        this.guestList = guestList;
    }
}
