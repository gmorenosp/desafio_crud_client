package com.devsuperior.desafio_crud_client.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

        public ResourceNotFoundException(String msg){
            super(msg);
    }
}
