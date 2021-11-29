package com.springboot.app.producto.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.app.producto.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto,Long>{

	
}
