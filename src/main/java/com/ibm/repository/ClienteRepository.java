package com.ibm.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibm.domain.Cliente;
import com.ibm.domain.dto.ClienteDTO;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	@Query("FROM Cliente c WHERE 1=1 "
			+ " and c.conta.numero = :numeroConta "
			+ " and c.conta.agencia.numero = :numeroAgencia ")
	Optional<Cliente> buscar(String numeroAgencia, String numeroConta);
	
	@Query("FROM Cliente")
	Page<ClienteDTO> buscarTodos(Pageable pageable);
	
	@Query("FROM Cliente c WHERE c.id = :id")
	ClienteDTO buscarPorId(Long id);

}
