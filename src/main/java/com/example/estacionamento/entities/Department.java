package com.example.estacionamento.entities;

import jakarta.persistence.*;
import jdk.jfr.Name;

@Entity
@Table(name = "tb_department")
public class Department {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    //ForeignKey
    private Long id;
    //long tipo de dado para numeros grandes

    private String name;


    public Department(){

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
