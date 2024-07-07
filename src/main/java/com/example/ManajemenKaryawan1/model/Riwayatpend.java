package com.example.ManajemenKaryawan1.model;


import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "riwayatpends")
public class Riwayatpend {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String pendidikan;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }
}