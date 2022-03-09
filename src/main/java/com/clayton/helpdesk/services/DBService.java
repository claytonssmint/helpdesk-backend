package com.clayton.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clayton.helpdesk.domain.Chamado;
import com.clayton.helpdesk.domain.Cliente;
import com.clayton.helpdesk.domain.Tecnico;
import com.clayton.helpdesk.domain.enums.Perfil;
import com.clayton.helpdesk.domain.enums.Prioridade;
import com.clayton.helpdesk.domain.enums.Status;
import com.clayton.helpdesk.repositories.ChamadoRepository;
import com.clayton.helpdesk.repositories.ClienteRepository;
import com.clayton.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Clayton Santos", "946.864.910-53", "clayton.santos@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		Tecnico tec2 = new Tecnico(null, "Linus Torvalds", "879.999.430-53", "linus@mail.com", "123");
		Tecnico tec3 = new Tecnico(null, "Matheus Torres", "660.339.190-25", "matheus@mail.com", "123");
		
		Cliente cli1 = new Cliente(null, "Rita Torres", "950.035.500-06", "rita.torres@mail.com", "123");
		Cliente cli2 = new Cliente(null, "Leia Santos", "929.395.110-04", "leia@mail.com", "123");
		Cliente cli3 = new Cliente(null, "Livia Santos", "370.274.690-06", "livia@mail.com", "123");
		
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);
		Chamado c2 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "Chamado 02", "Segundo Chamado", tec2, cli2);
		Chamado c3 = new Chamado(null, Prioridade.BAIXA, Status.ENCERRADO, "Chamado 03", "Terceiro Chamado", tec3, cli3);
		
		//PessoaRepository.saveAll(Arrays.asList(tec1, tec2));
		tecnicoRepository.saveAll(Arrays.asList(tec1, tec2, tec3));
		clienteRepository.saveAll(Arrays.asList(cli1, cli2, cli3));		
		chamadoRepository.saveAll(Arrays.asList(c1, c2, c3));
	}
}
