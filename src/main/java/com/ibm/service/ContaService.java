package com.ibm.service;

import java.math.BigDecimal;

import com.ibm.domain.Conta;
import com.ibm.record.ContaRecord;

public interface ContaService {

	Conta save(ContaRecord contaRecord);
	
	void depositar(BigDecimal valor, Long numeroConta, Long idCliente);

}
