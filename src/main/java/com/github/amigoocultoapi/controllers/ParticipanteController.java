package com.github.amigoocultoapi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.github.amigoocultoapi.models.Participante;
import com.github.amigoocultoapi.services.ParticipanteService;

@RestController
@RequestMapping("/participantes")
@Validated
public class ParticipanteController {
    private ParticipanteService participanteService;

    public ParticipanteController(ParticipanteService participanteService) {
        this.participanteService = participanteService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Participante criarParticipante(@RequestBody Participante participante) {
        return participanteService.criarParticipante(participante.getNome());
    }

    @GetMapping
    public List<Participante> listarParticipantes() {
        return participanteService.listarParticipantes();
    }
}
