package com.clayton.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clayton.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
