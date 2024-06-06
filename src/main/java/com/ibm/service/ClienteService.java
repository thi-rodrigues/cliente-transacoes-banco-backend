package com.ibm.service;

import com.ibm.record.ClienteDTO;
import com.ibm.record.ClienteRecord;
import com.ibm.record.TransacaoRecord;

public interface ClienteService {

	ClienteRecord save(ClienteRecord clienteRecord);

	ClienteDTO buscar(String agencia, String conta, String senha);
	
	void depositar(TransacaoRecord transacaoRecord);

	void debitar(TransacaoRecord transacaoRecord);

}
