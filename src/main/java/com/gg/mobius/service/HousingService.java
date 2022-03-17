package com.gg.mobius.service;

import java.util.List;

import com.gg.mobius.model.HousingModel;
import com.gg.mobius.repository.HousingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HousingService {
    
    @Autowired
    HousingRepository repository;
    
    public List<HousingModel> findAll() {
        return repository.findAll();
    }

    public HousingModel findOne(Long id) {
        return repository.getById(id);
    }

    public void create(HousingModel newHousing) {
        repository.save(newHousing);
    }

    public void update(HousingModel updateHousing) {
        repository.save(updateHousing);
    }

    public void delete(HousingModel deleteHousing) {
        repository.delete(deleteHousing);
    }


}
