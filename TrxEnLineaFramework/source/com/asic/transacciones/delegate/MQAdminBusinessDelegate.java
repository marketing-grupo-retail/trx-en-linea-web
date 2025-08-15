/*
 * Proyecto: Liberty Sistema de Encuestas
 *
 * Copyright (C) 2005-2006 Asic S.A. Bogotá, Colombia.
 * All rights Reserved.
 * $Id:
 *
 */
package com.asic.transacciones.delegate;

import java.util.List;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.factory.ServiceProvider;
import com.asic.transacciones.exception.UserUnknowException;
import com.asic.transacciones.vo.USUARIO;


/**
 * Servicios para Administracion de Usuarios
 *
 * @author
 */
public interface MQAdminBusinessDelegate extends ServiceProvider{
	
	public void enviarMensajeCola(Object pObj) throws ServiceException;
}
