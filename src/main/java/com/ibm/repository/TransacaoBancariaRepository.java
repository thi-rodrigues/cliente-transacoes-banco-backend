package com.ibm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ibm.domain.TransacaoBancaria;
import com.ibm.domain.dto.TransacaoBancariaDTO;

public interface TransacaoBancariaRepository extends JpaRepository<TransacaoBancaria, Long>{

	@Query("FROM TransacaoBancaria tb WHERE tb.cliente.id = :id")
	List<TransacaoBancariaDTO> buscarTodas(Long id);

}
