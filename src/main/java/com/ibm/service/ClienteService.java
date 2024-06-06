package com.ibm.service;

import com.ibm.record.ClienteDTO;
import com.ibm.record.ClienteRecord;
import com.ibm.record.DepositoRecord;

public interface ClienteService {

	ClienteRecord save(ClienteRecord clienteRecord);

	ClienteDTO buscar(String agencia, String conta, String senha);

	void depositar(DepositoRecord depositoRecord);

}
