package com.heinsohn.api.ejb.dao;

import java.util.List;

/**
 * Es un contrato, y nos permite exponer las diferentes opraciones a 
 * la base de datos o de persistencia
 * 
 * @author 
 *
 * @param <D> es un Generic, y nos va a servir para genear los metodos CRUD de nuestra aplicaciones
 */
public interface OperacionDAO<D> {
	
	List<D> consultarTodos();
	
	D consultarPorId(Long id);
	
	Boolean eliminarPorId(Long id);

	D insertar(D d);
	
	D actualizar(D d);
}
