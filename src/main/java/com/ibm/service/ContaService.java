package com.ibm.service;

import com.ibm.domain.Conta;

import jakarta.validation.Valid;

public interface ContaService {

	Conta save(@Valid Conta conta);

}
