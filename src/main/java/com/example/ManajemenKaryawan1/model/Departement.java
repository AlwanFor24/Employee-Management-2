package com.example.ManajemenKaryawan1.model;


import jakarta.persistence.*;
import lombok.Getter;


@Entity
@Table(name = "departements")
public class Departement {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String namadepart;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNamadepart() {
        return namadepart;
    }

    public void setNamadepart(String namadepart) {
        this.namadepart = namadepart;
    }
}