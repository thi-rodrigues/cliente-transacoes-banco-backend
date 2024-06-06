package com.ibm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.domain.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long> {

}
