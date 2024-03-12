package com.example.relationships.demo.model;

import jakarta.persistence.*;
import org.hibernate.annotations.IdGeneratorType;

import java.util.*;

@Entity
@Table(name = "association")
public class Association {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer associationId;


    private String associationName;
    @ManyToOne
    @JoinColumn(name = "member_name")
    private Member member;

    private String district;

    private String president;

    @OneToMany(mappedBy = "association")
    private Set<Member> list = new HashSet<>();

    public Association(String associationName, String district, String president, Set<Member> list) {
        setAssociationName(associationName);
        setDistrict(district);
        setPresident(president);
        setList(list);
    }

    public String getAssociationName() {
        return associationName;
    }

    public void setAssociationName(String associationName) {
        this.associationName = associationName;
    }

    public Integer getAssociationId() {
        return associationId;
    }

    public void setAssociationId(Integer associationId) {
        this.associationId = associationId;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public Set<Member> getList() {
        return list;
    }

    public void setList(Set<Member> list) {
        this.list = list;
    }
}
