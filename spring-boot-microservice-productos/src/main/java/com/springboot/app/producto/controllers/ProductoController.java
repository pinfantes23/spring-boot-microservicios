package com.springboot.app.producto.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.producto.models.entity.Producto;
import com.springboot.app.producto.models.service.IProductoService;

@RestController
public class ProductoController {

	@Autowired
	private Environment env;
	@Value("${server.port}")
	private Integer port;
	@Autowired
	private IProductoService iProductoService;
	
	@GetMapping("/listar")
	public List<Producto> listar(){	
		
		return iProductoService.findAll().stream().map(producto -> {		
			producto.setPort(port);
			return producto;
		}).collect(Collectors.toList());
		
	}
	
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id){	
		Producto producto = iProductoService.findById(id);
		producto.setPort(port);
		return producto;	
	}
	
	
}
