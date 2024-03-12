package com.example.relationships.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "speaker")
public class Speaker {
    @Id
    @Column(name = "name")
    private String name;
    @Column(name = "presentation_duration")
    private int presentationDuration;
    @ManyToOne
    private Event event;

    public Speaker(String name, int presentationDuration) {
        setName(name);
        setPresentationDuration(presentationDuration);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(int presentationDuration) {
        this.presentationDuration = presentationDuration;
    }
}
