package com.ibm.service;

import com.ibm.domain.Conta;
import com.ibm.record.ContaRecord;

public interface ContaService {

	Conta save(ContaRecord contaRecord);

}
