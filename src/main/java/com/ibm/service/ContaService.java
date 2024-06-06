package com.ibm.service;

import com.ibm.record.ClienteRecord;

import jakarta.validation.Valid;

public interface ContaService {

	ClienteRecord save(@Valid ClienteRecord clienteRecord);

}
