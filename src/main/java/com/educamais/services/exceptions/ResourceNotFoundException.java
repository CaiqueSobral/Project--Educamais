package com.educamais.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Object id){
        super("Aluno não encontrado. ID: " + id);
    }
}
