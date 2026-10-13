package com.example.demomvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demomvc.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {}
