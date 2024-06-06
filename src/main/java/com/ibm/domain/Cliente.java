package com.ibm.domain;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable {

	private static final long serialVersionUID = -8584312237926057339L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String nome;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "conta_id")
	private Conta conta;

	@NotBlank
	private String senha;

	@Email
	@NotBlank
	private String email;
	
	@Column(name = "DT_NASCIMENTO")
	private LocalDate dtNascimento;

}
