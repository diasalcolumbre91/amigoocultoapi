package com.github.amigoocultoapi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.amigoocultoapi.models.Participante;
import com.github.amigoocultoapi.repositories.ParticipanteRepository;

@Service
public class ParticipanteService {
    private ParticipanteRepository participanteRepository;

    public ParticipanteService(ParticipanteRepository participanteRepository) {
        this.participanteRepository = participanteRepository;
    }

    public Participante criarParticipante(String nome) {
        Participante novoParticipante = new Participante(nome);
        return participanteRepository.save(novoParticipante);
    }

    public List <Participante> listarParticipantes() {
        return participanteRepository.findAll();
    }
}
