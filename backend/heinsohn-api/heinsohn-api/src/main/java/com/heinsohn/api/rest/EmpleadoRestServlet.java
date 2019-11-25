package com.heinsohn.api.rest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heinsohn.api.ejb.EmpleadoEJB;

/**
 * Empleados API: Nos permite exponer las diferentes operaciones para el manejo
 * de la informacion del empleado
 * 
 * @author
 *
 */
@WebServlet(urlPatterns = "/api/v1/empleados")
public class EmpleadoRestServlet extends HttpServlet {

	private EmpleadoEJB empleadoEJB;

	/**
	 * Permite consultar la informacion de todos los empleados o un empleado
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	/**
	 * Nos permite registrar la informacion de un empledo
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
	/**
	 * Nos permite actualizar la informacion de un empleado
	 */
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPut(req, resp);
	}
	
	/**
	 * Nos permite eliminar un empleado
	 */
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doDelete(req, resp);
	}

}
