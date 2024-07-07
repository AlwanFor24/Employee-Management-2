package com.example.ManajemenKaryawan1.service.impl;

import java.util.List;
import java.util.Optional;

import com.example.ManajemenKaryawan1.model.Departement;
import com.example.ManajemenKaryawan1.repository.DepartementRepository;
import com.example.ManajemenKaryawan1.service.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DepartementServiceImpl implements DepartementService {

    @Autowired
    private DepartementRepository departementRepository;

    @Override
    public List<Departement> getAllDepartements() {
        return departementRepository.findAll();
    }

    @Override
    public void saveDepartement(Departement departement) {
        this.departementRepository.save(departement);
    }

    @Override
    public Departement getDepartementById(long id) {
        Optional<Departement> optional = departementRepository.findById(id);
        Departement departement;
        if (optional.isPresent()) {
            departement =  optional.get();
        } else {
            throw new RuntimeException(" Departement not found for id :: " + id);
        }
        return departement;
    }

    @Override
    public void deleteDepartementById(long id) {
        this.departementRepository.deleteById(id);
    }



}