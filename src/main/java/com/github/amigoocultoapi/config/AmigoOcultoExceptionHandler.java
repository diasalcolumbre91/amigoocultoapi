package com.github.amigoocultoapi.config;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.github.amigoocultoapi.exceptions.NegocioException;
import com.github.amigoocultoapi.responses.ErroResponse;

@RestControllerAdvice
public class AmigoOcultoExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErroResponse> lidaComErrosDeValidacao(MethodArgumentNotValidException exception) {
        String mensagem = "";

        for (FieldError error: exception.getFieldErrors()) {
            mensagem += error.getField() + " " + error.getDefaultMessage() + "\n";
        }

        return ResponseEntity.badRequest()
        .body(new ErroResponse(ErroResponse.Tipo.VALIDACAO, mensagem));
    }

    @ExceptionHandler(NegocioException.class)
    public ResponseEntity <ErroResponse> lidaComExcecoesDeNegocio(NegocioException exception) {
        return ResponseEntity.badRequest()
        .body(new ErroResponse(ErroResponse.Tipo.NEGOCIO, exception.getMessage()));
    }
}
