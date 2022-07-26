package com.github.amigoocultoapi.requests;

import javax.validation.constraints.NotBlank;

public class NovoSorteioRequest {
    @NotBlank
    private String nome;

    public NovoSorteioRequest() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
