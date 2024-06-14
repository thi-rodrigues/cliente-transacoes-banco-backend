package com.ibm.domain.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.ibm.domain.TransacaoBancaria;
import com.ibm.domain.enums.TipoTransacaoEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransacaoBancariaDTO {
	
	private TipoTransacaoEnum tipoTransacao;
	private LocalDateTime dtTransacao;
	private BigDecimal valor;
	
	public TransacaoBancariaDTO(TransacaoBancaria transacaoBancaria) {
		this.tipoTransacao = transacaoBancaria.getTipoTransacao();
		this.dtTransacao = transacaoBancaria.getDtTransacao();
		this.valor = transacaoBancaria.getValor();
	}
	
}
