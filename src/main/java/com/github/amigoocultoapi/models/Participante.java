package com.github.amigoocultoapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name ="tlb_participante")
public class Participante {

    @Column(name = "id_participante")
    private int id;

    @Column(name = "nome")
    @NotEmpty
    private String nome;


    @Column(name = "amigo_oculto")
    private String amigoOculto;

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
