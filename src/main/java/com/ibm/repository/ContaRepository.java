package com.ibm.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibm.domain.Conta;

import jakarta.transaction.Transactional;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {

	@Modifying
	@Transactional
	@Query("UPDATE Conta c "
			+ " SET c.ativa = true, c.saldo = :valor "
			+ " WHERE c.numero = :numeroConta AND c.id = "
			+ " ( Select cli.id from Cliente cli where cli.id = :idCliente )")
	void depositar(BigDecimal valor, Long numeroConta, Long idCliente);
}
