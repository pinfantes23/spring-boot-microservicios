package com.springboot.app.producto.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.producto.models.entity.Producto;
import com.springboot.app.producto.models.repository.IProductoDao;

@Service
public class ProductoServiceImpl implements IProductoService{

	//importante para que no pete le da memoria!!
	@Autowired
	private IProductoDao productoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		return  productoDao.findById(id).orElse(null);
	}

}
