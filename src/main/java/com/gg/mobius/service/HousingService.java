package com.gg.mobius.service;

import com.gg.mobius.repository.HousingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HousingService {
    
    @Autowired
    HousingRepository repository;
    

}
