package com.example.asmspring.service;
import com.example.asmspring.entity.Districts;
import com.example.asmspring.repository.DistrictsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictsService {
    @Autowired
    private DistrictsRepository districtsRepository;

    public List<Districts> findAll() {
        return districtsRepository.findAll();
    }

    public Districts save(Districts districts) {
        return districtsRepository.save(districts);
    }
}