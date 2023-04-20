package com.trupper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.trupper.entities.Pedidos;
import com.trupper.repository.PedidosRepository;

@Controller
@RequestMapping(path="/demo")
public class MainController {
	
	@Autowired
	private PedidosRepository pedidosRepository;
	
	@GetMapping("/getAllPedidos")
	public @ResponseBody Iterable<Pedidos> getAllPedidos() {
	    return pedidosRepository.findAll();
	}
	
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s!", name);
    }

}
