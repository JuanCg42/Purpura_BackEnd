package com.purpura.transversal.excepciones;

import com.purpura.transversal.excepciones.enums.Capa;

public class PurpuraControladorExcepcion extends PurpuraExcepcion {

	private static final long serialVersionUID = 1L;

	protected PurpuraControladorExcepcion(String mensajeTecnico, String mensajeUsuario, Exception excepcionRaiz) {
		super(Capa.CONTROLADOR, mensajeTecnico, mensajeUsuario, excepcionRaiz);

	}

	public static PurpuraExcepcion crear(String mensajeUsuario) {
		return new PurpuraControladorExcepcion(mensajeUsuario, mensajeUsuario, new Exception(mensajeUsuario));
	}
	
	public static PurpuraExcepcion crear(String mensajeUsuario,String mensajeTecnico) {
		return new PurpuraControladorExcepcion(mensajeUsuario, mensajeTecnico, new Exception(mensajeTecnico));
	}
	
	public static PurpuraExcepcion crear(String mensajeUsuario,String mensajeTecnico,Exception excepcionRaiz) {
		return new PurpuraControladorExcepcion(mensajeUsuario, mensajeTecnico,excepcionRaiz);
	}

}
