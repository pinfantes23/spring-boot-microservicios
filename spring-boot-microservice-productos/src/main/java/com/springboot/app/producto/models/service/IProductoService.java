package com.springboot.app.producto.models.service;

import java.util.List;

import com.springboot.app.producto.models.entity.Producto;


public interface IProductoService {

	public List<Producto> findAll();
	
	public Producto findById(Long id);
	
}
