package com.example.ManajemenKaryawan1.model;

import jakarta.persistence.*;

import lombok.Getter;



@Entity
@Table(name = "employees")
public class Employee {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int nip;
    @Column(nullable = false)
    private String nama;

    @Column(nullable = false)
    private String departement;

    @Column(nullable = false)
    private String riwayatpend;

    @Column(nullable = false)
    private int notelp;

    @Column(nullable = false)
    private String email;

    @Column(nullable =false)
    private float gaji;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getRiwayatpend() {
        return riwayatpend;
    }

    public void setRiwayatpend(String riwayatpend) {
        this.riwayatpend = riwayatpend;
    }

    public int getNotelp() {
        return notelp;
    }

    public void setNotelp(int notelp) {
        this.notelp = notelp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getGaji() {
        return gaji;
    }

    public void setGaji(float gaji) {
        this.gaji = gaji;
    }
}