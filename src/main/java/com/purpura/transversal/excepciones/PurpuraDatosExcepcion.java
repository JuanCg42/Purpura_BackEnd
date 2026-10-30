package com.purpura.transversal.excepciones;

import com.purpura.transversal.excepciones.enums.Capa;

public class PurpuraDatosExcepcion extends PurpuraExcepcion {

	private static final long serialVersionUID = 1L;

	protected PurpuraDatosExcepcion(String mensajeTecnico, String mensajeUsuario, Exception excepcionRaiz) {
		super(Capa.DATOS, mensajeTecnico, mensajeUsuario, excepcionRaiz);

	}

	public static PurpuraExcepcion crear(String mensajeUsuario) {
		return new PurpuraDatosExcepcion(mensajeUsuario, mensajeUsuario, new Exception(mensajeUsuario));
	}
	
	public static PurpuraExcepcion crear(String mensajeTecnico,String mensajeUsuario) {
		return new PurpuraDatosExcepcion(mensajeTecnico, mensajeUsuario, new Exception(mensajeTecnico));
	}
	
	public static PurpuraExcepcion crear(String mensajeTecnico,String mensajeUsuario,Exception excepcionRaiz) {
		return new PurpuraDatosExcepcion(mensajeTecnico, mensajeUsuario,excepcionRaiz);
	}

}
