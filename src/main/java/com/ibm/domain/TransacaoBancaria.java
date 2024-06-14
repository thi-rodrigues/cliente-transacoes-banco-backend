package com.ibm.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.ibm.domain.enums.TipoTransacaoEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransacaoBancaria implements Serializable {
	
	private static final long serialVersionUID = -369570212290806263L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinColumn(name = "CLIENTE_ID")
	private Cliente cliente;
	
	@Enumerated(EnumType.ORDINAL)
	private TipoTransacaoEnum tipoTransacao;
	
	@Column(name = "DT_TRANSACAO")
	private LocalDateTime dtTransacao;
	
	private BigDecimal valor;

}
