package com.ibm.service;

import java.math.BigDecimal;
import java.util.List;

import com.ibm.domain.dto.TransacaoBancariaDTO;
import com.ibm.domain.enums.TipoTransacaoEnum;

public interface TransacaoBancariaService {

	void realizarTransacao(Long idCliente, BigDecimal valor, TipoTransacaoEnum tipoTransacao);

	List<TransacaoBancariaDTO> buscarTodas(Long idCliente);
}
