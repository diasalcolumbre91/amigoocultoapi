package com.github.amigoocultoapi.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.github.amigoocultoapi.exceptions.SorteioNaoEncontrado;
import com.github.amigoocultoapi.models.Participante;
import com.github.amigoocultoapi.models.Sorteio;
import com.github.amigoocultoapi.repositories.SorteioRepository;

@Service
public class SorteioService {
    private SorteioRepository SorteioRepository;
    private ParticipanteService participanteService;

    public SorteioService(SorteioRepository sorteioRepository, ParticipanteService participanteService) {
        this.SorteioRepository = sorteioRepository;
        this.participanteService = participanteService;
    }

    public Sorteio criarSorteio(String nome) {
        Sorteio novoSorteio = new Sorteio(nome);
        return SorteioRepository.save(novoSorteio);
    }

    public Optional <Sorteio> procurarSorteioPeloId(int id) {
        return SorteioRepository.findById(id);
    }

    public Sorteio procurarSorteioPeloIdDandoErro(int id) {
        return procurarSorteioPeloId(id).orElseThrow(() -> new SorteioNaoEncontrado(id));
    }

    public Sorteio adicionarParticipanteAoSorteio(int idSorteio, int idParticipante) {
        Sorteio sorteio = procurarSorteioPeloIdDandoErro(idSorteio);
        Participante participante = participanteService.procurarParticipantePeloIdDandoErro(idParticipante);

        sorteio.getParticipantes().add(participante);

        return SorteioRepository.save(sorteio);
    }
}
