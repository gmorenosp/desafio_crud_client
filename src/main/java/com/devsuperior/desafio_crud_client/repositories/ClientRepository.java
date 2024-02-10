package com.devsuperior.desafio_crud_client.repositories;

import com.devsuperior.desafio_crud_client.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
