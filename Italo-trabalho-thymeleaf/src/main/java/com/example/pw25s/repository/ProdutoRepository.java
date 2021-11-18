package com.example.pw25s.repository;

import com.example.pw25s.model.Pedido;
import com.example.pw25s.model.Produto;
import com.example.pw25s.model.enums.StatusPedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    public List<Produto> findAll();
}
