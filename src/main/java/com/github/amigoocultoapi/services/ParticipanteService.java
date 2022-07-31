package com.github.amigoocultoapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.github.amigoocultoapi.exceptions.ParticipanteNaoEncontrado;
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

    public Optional<Participante> procurarParticipantePeloId(int id) {
        return participanteRepository.findById(id);
    }

    public Participante procurarParticipantePeloIdDandoErro(int id) {
        return procurarParticipantePeloId(id).orElseThrow(() -> new ParticipanteNaoEncontrado(id));
    }
}
