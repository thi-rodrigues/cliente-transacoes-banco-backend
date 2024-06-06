package com.ibm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.domain.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {

}
