package com.gg.mobius.repository;

import com.gg.mobius.model.MarkerModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkerRepository extends JpaRepository<MarkerModel, Long> {
    
}
