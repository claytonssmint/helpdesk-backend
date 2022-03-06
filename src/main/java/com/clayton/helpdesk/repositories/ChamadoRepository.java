package com.clayton.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clayton.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
