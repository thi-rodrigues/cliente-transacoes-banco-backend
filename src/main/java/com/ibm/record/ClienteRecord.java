package com.ibm.record;

import java.time.LocalDate;

public record ClienteRecord(String nome, String senha, String email, LocalDate dtNascimento, ContaRecord conta) {

}
