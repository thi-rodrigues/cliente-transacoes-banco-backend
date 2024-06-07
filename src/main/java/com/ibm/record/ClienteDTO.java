package com.ibm.record;

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
	
	public ClienteDTO(Cliente c) {
		this.nome = c.getNome();
		this.email = c.getEmail();
		this.dtNascimento = c.getDtNascimento();
		this.conta = c.getConta();
	}

	
	

}
