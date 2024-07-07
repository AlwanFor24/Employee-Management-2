package com.example.ManajemenKaryawan1.service;

import java.util.List;
import com.example.ManajemenKaryawan1.model.Departement;

public interface DepartementService {
    List<Departement> getAllDepartements();
    void saveDepartement(Departement departement);
    Departement getDepartementById(long id);
    void deleteDepartementById(long id);

}
