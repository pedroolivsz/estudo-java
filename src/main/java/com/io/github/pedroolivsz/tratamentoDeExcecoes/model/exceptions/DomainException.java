package com.io.github.pedroolivsz.tratamentoDeExcecoes.model.exceptions;

public class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }
}
