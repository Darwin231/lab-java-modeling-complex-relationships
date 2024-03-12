package com.example.relationships.demo.repository;

import com.example.relationships.demo.model.Association;
import com.example.relationships.demo.model.Member;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociationRepository extends JpaRepository<Association, Integer> {

    Association findByAssociationName(String associationName);

}
