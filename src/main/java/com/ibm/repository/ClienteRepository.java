package com.ibm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
