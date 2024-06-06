package com.ibm.service.impl;

import java.util.List;

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
	public List<Agencia> findAll() {
		return agenciaRepository.findAll();
	}
	
}
