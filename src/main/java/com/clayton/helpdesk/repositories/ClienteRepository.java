package com.clayton.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clayton.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
