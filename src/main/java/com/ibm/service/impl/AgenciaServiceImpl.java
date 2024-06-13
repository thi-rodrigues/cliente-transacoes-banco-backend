package com.ibm.service.impl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.domain.Agencia;
import com.ibm.repository.AgenciaRepository;
import com.ibm.service.AgenciaService;

@Service
public class AgenciaServiceImpl implements AgenciaService {

	@Autowired
	private AgenciaRepository agenciaRepository;

	@Override
	public Agencia save(Agencia agencia) {
		agencia.setNumero(gerarNumeroAgencia().longValue());
		return agenciaRepository.save(agencia);
	}
	
	private Integer gerarNumeroAgencia() {
		Integer agencia = new Random().nextInt();
		
		if (agencia < 0) 
			return agencia * (-1);
		
		return agencia;
	}
	
}
