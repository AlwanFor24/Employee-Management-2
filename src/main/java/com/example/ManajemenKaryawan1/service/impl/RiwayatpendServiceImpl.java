package com.example.ManajemenKaryawan1.service.impl;

import java.util.List;
import java.util.Optional;

import com.example.ManajemenKaryawan1.model.Riwayatpend;
import com.example.ManajemenKaryawan1.repository.RiwayatpendRepository;
import com.example.ManajemenKaryawan1.service.RiwayatpendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RiwayatpendServiceImpl implements RiwayatpendService {
    @Autowired
    private RiwayatpendRepository riwayatpendRepository;

    @Override
    public List<Riwayatpend> getAllRiwayatpends() {
        return riwayatpendRepository.findAll();
    }

    @Override
    public void saveRiwayatpend(Riwayatpend riwayatpend) {
        this.riwayatpendRepository.save(riwayatpend);
    }

    @Override
    public Riwayatpend getRiwayatpendById(long id) {
        Optional<Riwayatpend> optional = riwayatpendRepository.findById(id);
        Riwayatpend riwayatpend;
        if (optional.isPresent()) {
            riwayatpend = optional.get();
        } else {
            throw new RuntimeException(" Riwayatpend not found for id :: " + id);
        }
        return riwayatpend;
    }

    @Override
    public void deleteRiwayatpendById(long id) {
        this.riwayatpendRepository.deleteById(id);
    }
}
