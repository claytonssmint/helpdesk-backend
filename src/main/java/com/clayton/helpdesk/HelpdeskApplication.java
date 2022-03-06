package com.clayton.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.clayton.helpdesk.domain.Chamado;
import com.clayton.helpdesk.domain.Cliente;
import com.clayton.helpdesk.domain.Tecnico;
import com.clayton.helpdesk.domain.enums.Perfil;
import com.clayton.helpdesk.domain.enums.Prioridade;
import com.clayton.helpdesk.domain.enums.Status;
import com.clayton.helpdesk.repositories.ChamadoRepository;
import com.clayton.helpdesk.repositories.ClienteRepository;
import com.clayton.helpdesk.repositories.TecnicoRepository;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		Tecnico tec1 = new Tecnico(null, "Clayton Santos", "946.864.910-53", "clayton.santos@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Rita Torres", "950.035.500-06", "rita.torres@mail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}

}
