package com.trupper.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pedidos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idPedido;

	private Integer  idPedidoDetail;

	public Integer getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	public Integer getIdPedidoDetail() {
		return idPedidoDetail;
	}

	public void setIdPedidoDetail(Integer idPedidoDetail) {
		this.idPedidoDetail = idPedidoDetail;
	}
	

}
