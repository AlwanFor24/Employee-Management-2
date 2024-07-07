package com.example.ManajemenKaryawan1.repository;

import com.example.ManajemenKaryawan1.model.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Long> {
}
