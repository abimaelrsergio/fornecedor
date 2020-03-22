package com.br.abgi.microservice.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;

import com.br.abgi.microservice.fornecedor.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
