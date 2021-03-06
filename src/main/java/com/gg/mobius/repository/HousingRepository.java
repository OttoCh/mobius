package com.gg.mobius.repository;

import com.gg.mobius.model.HousingModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HousingRepository extends JpaRepository<HousingModel, Long>{
    
}
