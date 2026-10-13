package com.example.demomvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demomvc.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {}