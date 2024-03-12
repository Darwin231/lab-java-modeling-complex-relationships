package com.example.relationships.demo.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "members")
public class Member {

    @Id
    @Column(name = "member_name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "member_status")
    private Status status;
    @Column(name = "renewal_date")
    private Date renewalDate;

    @ManyToOne
    private Association association;

    public Member(String name, Status status, Date renewalDate) {
        setName(name);
        setStatus(status);
        setRenewalDate(renewalDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }
}
