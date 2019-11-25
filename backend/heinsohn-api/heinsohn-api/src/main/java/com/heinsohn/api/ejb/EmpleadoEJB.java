package com.heinsohn.api.ejb;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import com.heinsohn.api.ejb.dao.DAO;
import com.heinsohn.api.ejb.dao.OperacionDAO;
import com.heinsohn.api.ejb.domain.Empleado;

/**
 * Permite manejar las transacciones para la administracion de la
 * informacion de los empleados
 * 
 * @author 
 *
 */
@Local
@Stateless(name = "EmpleadoEJB")
public class EmpleadoEJB extends DAO implements OperacionDAO<Empleado> {

	@Override
	public List<Empleado> consultarTodos() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Empleado consultarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleado insertar(Empleado d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleado actualizar(Empleado d) {
		// TODO Auto-generated method stub
		return null;
	}

}
