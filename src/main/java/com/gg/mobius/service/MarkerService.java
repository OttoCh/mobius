package com.gg.mobius.service;

import java.util.List;

import com.gg.mobius.model.MarkerModel;
import com.gg.mobius.repository.MarkerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarkerService {
    
    @Autowired
    MarkerRepository repository;

    public List<MarkerModel> findAll() {
        return repository.findAll();
    }

}
