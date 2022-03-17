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

    public MarkerModel findOne(Long id) {
        return repository.findById(id).get();
    }

    public void create(MarkerModel newMarker) {
        repository.save(newMarker);
    }

    public void update(MarkerModel updatedMarker) {
        repository.save(updatedMarker);
    }

    public void delete(MarkerModel deleteMarker) {
        repository.delete(deleteMarker);
    }

}
