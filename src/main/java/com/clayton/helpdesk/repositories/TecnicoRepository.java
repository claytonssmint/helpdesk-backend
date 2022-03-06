package com.clayton.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clayton.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
