package com.ibm.domain.dto;

import java.time.LocalDate;

import com.ibm.domain.Cliente;
import com.ibm.domain.Conta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {

	private Long id;
	private String nome;
	private String email;
	private LocalDate dtNascimento;
	private Conta conta;
	
	public ClienteDTO(Cliente cliente) {
		this.id = cliente.getId();
		this.nome = cliente.getNome();
		this.email = cliente.getEmail();
		this.dtNascimento = cliente.getDtNascimento();
		this.conta = cliente.getConta();
	}

}
