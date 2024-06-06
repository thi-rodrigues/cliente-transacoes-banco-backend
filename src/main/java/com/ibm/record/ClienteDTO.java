package com.ibm.record;

import java.time.LocalDate;

import com.ibm.domain.Conta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {

	private String nome;
	private String email;
	private LocalDate dtNascimento;
	private Conta conta;

}