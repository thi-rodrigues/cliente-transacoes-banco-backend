package com.ibm.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.domain.Agencia;
import com.ibm.domain.Conta;
import com.ibm.record.ContaRecord;
import com.ibm.repository.ContaRepository;
import com.ibm.service.AgenciaService;
import com.ibm.service.ContaService;

@Service
public class ContaServiceImpl implements ContaService {
	
	@Autowired
	private ContaRepository contaRepository;
	
	@Autowired
	private AgenciaService agenciaService;

	@Override
	public Conta save(ContaRecord contaRecord) {
		List<Agencia> agencias = agenciaService.findAll();
		// TODO: referenciar conta a agencia
		return contaRepository.save(new Conta(contaRecord.numero(), agencias.get(0), BigDecimal.ZERO, false));
	}

}
