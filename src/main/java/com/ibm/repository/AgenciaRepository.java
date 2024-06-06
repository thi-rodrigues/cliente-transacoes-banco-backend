package com.ibm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.domain.Agencia;

public interface AgenciaRepository extends JpaRepository<Agencia, Long> {
	

}
