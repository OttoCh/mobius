package com.gg.mobius;

import javax.annotation.PostConstruct;

import com.gg.mobius.service.MarkerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class InitService {
    
    @Autowired
    MarkerService markerService;

    @PostConstruct
    public void init() {
        log.info(markerService.findAll().toString());
    }

}
