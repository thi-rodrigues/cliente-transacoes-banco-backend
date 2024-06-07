package com.ibm.service;

import org.springframework.data.domain.Page;

import com.ibm.record.ClienteDTO;
import com.ibm.record.ClienteRecord;
import com.ibm.record.TransacaoRecord;

public interface ClienteService {

	ClienteRecord save(ClienteRecord clienteRecord);

	ClienteDTO buscar(String agencia, String conta);
	
	void depositar(TransacaoRecord transacaoRecord);

	void debitar(TransacaoRecord transacaoRecord);

	Page<ClienteDTO> buscarTodos(int page, int size);

}
