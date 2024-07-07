package com.example.ManajemenKaryawan1.repository;

import com.example.ManajemenKaryawan1.model.Riwayatpend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RiwayatpendRepository extends JpaRepository<Riwayatpend, Long> {
}
