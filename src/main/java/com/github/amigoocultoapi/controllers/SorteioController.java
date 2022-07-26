package com.github.amigoocultoapi.controllers;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.github.amigoocultoapi.models.Sorteio;
import com.github.amigoocultoapi.requests.NovoSorteioRequest;
import com.github.amigoocultoapi.services.SorteioService;

@RestController
@RequestMapping("/sorteios")
public class SorteioController {
    private SorteioService sorteioService;

    public SorteioController(SorteioService sorteioService) {
        this.sorteioService = sorteioService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Sorteio criarNovoSorteio(@Valid @RequestBody NovoSorteioRequest novoSorteioRequest) {
        return sorteioService.criarSorteio(novoSorteioRequest.getNome());
    }
}
