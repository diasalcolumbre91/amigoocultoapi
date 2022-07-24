package com.github.amigoocultoapi.responses;

public class ErroResponse {
    private Tipo tipo;
    private String mensagem;
    
    public ErroResponse(Tipo tipo, String mensagem) {
        this.tipo = tipo;
        this.mensagem = mensagem;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public static enum Tipo {
        VALIDACAO, NEGOCIO;
    }
}