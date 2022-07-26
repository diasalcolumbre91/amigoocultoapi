package com.github.amigoocultoapi.exceptions;

public class ParticipanteNaoEncontrado extends NegocioException {
    public ParticipanteNaoEncontrado(int id) {
        super("Participante de id " + id + " não foi encontrado.");
    }
}
