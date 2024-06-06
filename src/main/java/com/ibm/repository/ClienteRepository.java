package com.ibm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibm.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	@Query("FROM Cliente c WHERE c.senha = :senha "
			+ " and c.conta.numero = :numeroConta "
			+ " and c.conta.agencia.numero = :numeroAgencia ")
	Optional<Cliente> buscar(String numeroAgencia, String numeroConta, String senha);

}
