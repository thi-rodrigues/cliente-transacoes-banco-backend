package com.ibm.service.impl;

import org.springframework.stereotype.Service;

import com.ibm.record.ClienteRecord;
import com.ibm.service.ContaService;

import jakarta.validation.Valid;

@Service
public class ContaServiceImpl implements ContaService {

	@Override
	public ClienteRecord save(@Valid ClienteRecord clienteRecord) {
		
		return null;
	}

}
