package com.educamais.services.exceptions;

public class IdAlreadyRegisteredException extends RuntimeException {

    public IdAlreadyRegisteredException(Long id) {
        super("O número: '" + id + "' já existe!");
    }
}
