package com.devsuperior.desafio_crud_client.services;

import com.devsuperior.desafio_crud_client.dto.ClientDTO;
import com.devsuperior.desafio_crud_client.entities.Client;
import com.devsuperior.desafio_crud_client.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    public ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id){
        Optional<Client> result = repository.findById(id);
        Client client = result.get();
        ClientDTO dto = new ClientDTO(client);
        return dto;

    }

}