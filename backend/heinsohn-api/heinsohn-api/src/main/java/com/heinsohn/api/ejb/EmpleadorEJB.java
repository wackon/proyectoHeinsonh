package com.heinsohn.api.ejb;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import com.heinsohn.api.ejb.dao.DAO;
import com.heinsohn.api.ejb.dao.OperacionDAO;
import com.heinsohn.api.ejb.domain.Empleador;
import com.heinsohn.api.ejb.dao.DAO;

/**
 * Permite manejar las transacciones para la administracion de la
 * informacion de los empleadores
 * 
 * @author 
 *
 */

@Local
@Stateless(name = "EmpleadorEJB")
public class EmpleadorEJB extends DAO {
	
    
   /* @Override
	public List<Empleador> consultarTodos() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Empleador consultarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleador insertar(Empleador d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleador actualizar(Empleador d) {
		// TODO Auto-generated method stub
		return null;
	}
*/
}
