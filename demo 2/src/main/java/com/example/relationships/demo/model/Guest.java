package com.example.relationships.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "guest")
public class Guest {
    @Id
    @Column(name = "name")
    private String name;
    @Enumerated(EnumType.STRING)
    private GuestStatus status;
    @ManyToOne
    private Event event;

    public Guest(String name, GuestStatus status) {
        setName(name);
        setStatus(status);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GuestStatus getStatus() {
        return status;
    }

    public void setStatus(GuestStatus status) {
        this.status = status;
    }
}
