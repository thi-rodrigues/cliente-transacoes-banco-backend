package com.ibm.service.impl;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.domain.Cliente;
import com.ibm.domain.TransacaoBancaria;
import com.ibm.domain.dto.TransacaoBancariaDTO;
import com.ibm.domain.enums.TipoTransacaoEnum;
import com.ibm.repository.TransacaoBancariaRepository;
import com.ibm.service.TransacaoBancariaService;

@Service
public class TransacaoBancariaServiceImpl implements TransacaoBancariaService {
	
	@Autowired
	private TransacaoBancariaRepository transacaoBancariaRepository;

	@Override
	public void realizarTransacao(Long idCliente, BigDecimal valor, TipoTransacaoEnum tipoTransacao) {
		TransacaoBancaria transacaoBancaria = new TransacaoBancaria(null, new Cliente(idCliente), 
				tipoTransacao, LocalDateTime.now(), valor);
		transacaoBancariaRepository.save(transacaoBancaria);
	}

	@Override
	public List<TransacaoBancariaDTO> buscarTodas(Long idCliente) {
		return transacaoBancariaRepository.buscarTodas(idCliente);
	}

}
