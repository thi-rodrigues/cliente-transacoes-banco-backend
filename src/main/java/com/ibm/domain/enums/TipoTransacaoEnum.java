package com.ibm.domain.enums;

public enum TipoTransacaoEnum {
	
	DEBITO(0),
	DEPOSITO(1);
	
	private Integer tipoTransacao;

	TipoTransacaoEnum(Integer tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}

	public Integer getTipoTransacao() {
		return tipoTransacao;
	}

	public void setTipoTransacao(Integer tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}
	
}
