package com.ibm.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.domain.Agencia;
import com.ibm.domain.Conta;
import com.ibm.record.ContaRecord;
import com.ibm.repository.ContaRepository;
import com.ibm.service.AgenciaService;
import com.ibm.service.ContaService;

@Service
public class ContaServiceImpl implements ContaService {

	@Autowired
	private ContaRepository contaRepository;

	@Autowired
	private AgenciaService agenciaService;
	
	@Override
	public Conta save(ContaRecord contaRecord) {
		List<Agencia> agencias = agenciaService.findAll();
		// TODO: referenciar conta a agencia
		return contaRepository.save(new Conta(contaRecord.numero(), agencias.get(0), BigDecimal.ZERO, false));
	}

	@Override
	public void depositar(BigDecimal valor, Long numeroConta, Long idCliente) {
		Conta conta = buscarConta(numeroConta);
		
		if (valor.compareTo(BigDecimal.ZERO) >= 1)
			contaRepository.depositar(conta.getSaldo().add(valor), numeroConta, idCliente);
		else
			// TODO: lançar exceção
			System.out.println("Deposito tem que ser maior que 0");
	}

	@Override
	public void debitar(BigDecimal valor, Long numeroConta, Long idCliente) {
		Conta conta = buscarConta(numeroConta);
		
		if (valor.compareTo(BigDecimal.ZERO) >= 1 && conta.getSaldo().compareTo(BigDecimal.ZERO) >=1 )
			contaRepository.debitar(conta.getSaldo().subtract(valor), numeroConta, idCliente);
		else
			// TODO: lançar exceção
			System.out.println("Conta com saldo menor ou igual a 0");
	}
	
	private Conta buscarConta(Long numeroConta) {
		return contaRepository.findByNumero(numeroConta);
	}

}
