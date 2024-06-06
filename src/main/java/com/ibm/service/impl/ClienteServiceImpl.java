package com.ibm.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.domain.Cliente;
import com.ibm.domain.Conta;
import com.ibm.record.ClienteRecord;
import com.ibm.repository.ClienteRepository;
import com.ibm.service.ClienteService;
import com.ibm.service.ContaService;

import jakarta.validation.Valid;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ContaService contaService;

	@Override
	public ClienteRecord save(@Valid ClienteRecord clienteRecord) {
		Cliente cliente = new Cliente();
		Conta conta = new Conta();
		BeanUtils.copyProperties(clienteRecord.conta(), conta);
		BeanUtils.copyProperties(clienteRecord, cliente);
		
		Conta save = contaService.save(conta);
		cliente.setConta(save);
		
		clienteRepository.save(cliente);
		return clienteRecord;
	}

}
