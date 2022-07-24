package com.github.amigoocultoapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name ="tlb_participante")
public class Participante {

    @Column(name = "id_participante")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nome", nullable = false)
    @NotEmpty
    private String nome;

    @Column(name = "amigo_oculto")
    private String amigoOculto;

    
    public Participante() {
    }

    public Participante(String nome) {
        this.nome = nome;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAmigoOculto() {
        return amigoOculto;
    }

    public void setAmigoOculto(String amigoOculto) {
        this.amigoOculto = amigoOculto;
    }
}
