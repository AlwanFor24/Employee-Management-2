package com.example.ManajemenKaryawan1.service;

import java.util.List;
import com.example.ManajemenKaryawan1.model.Riwayatpend;

public interface RiwayatpendService {
    List<Riwayatpend> getAllRiwayatpends();
    void saveRiwayatpend(Riwayatpend riwayatpend);
    Riwayatpend getRiwayatpendById(long id);
    void deleteRiwayatpendById(long id);
}
