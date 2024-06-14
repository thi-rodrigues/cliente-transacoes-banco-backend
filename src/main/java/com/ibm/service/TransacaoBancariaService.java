package com.ibm.service;

import java.math.BigDecimal;

import com.ibm.domain.enums.TipoTransacaoEnum;

public interface TransacaoBancariaService {

	void realizarTransacao(Long idCliente, BigDecimal valor, TipoTransacaoEnum tipoTransacao);
}
