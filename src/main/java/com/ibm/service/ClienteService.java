package com.ibm.service;

import com.ibm.record.ClienteDTO;
import com.ibm.record.ClienteRecord;

public interface ClienteService {

	ClienteRecord save(ClienteRecord clienteRecord);

	ClienteDTO buscar(String agencia, String conta, String senha);

}
