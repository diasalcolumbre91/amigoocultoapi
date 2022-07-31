package com.github.amigoocultoapi.exceptions;

public class SorteioNaoEncontrado extends NegocioException {
    public SorteioNaoEncontrado(int id) {
        super("O sorteio de id " + id + " não foi encontrado.");
    }
}