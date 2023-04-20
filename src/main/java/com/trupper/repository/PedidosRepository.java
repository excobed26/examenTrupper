package com.trupper.repository;
import org.springframework.data.repository.CrudRepository;

import com.trupper.entities.Pedidos;

public interface PedidosRepository extends CrudRepository<Pedidos,Integer> {
	
}
