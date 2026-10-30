package com.purpura.transversal.excepciones;

import com.purpura.transversal.excepciones.enums.Capa;

public class PurpuraDominioExcepcion extends PurpuraExcepcion {

	private static final long serialVersionUID = 1L;

	protected PurpuraDominioExcepcion(String mensajeTecnico, String mensajeUsuario, Exception excepcionRaiz) {
		super(Capa.DOMINIO, mensajeTecnico, mensajeUsuario, excepcionRaiz);

	}

	public static PurpuraExcepcion crear(String mensajeUsuario) {
		return new PurpuraDominioExcepcion(mensajeUsuario, mensajeUsuario, new Exception(mensajeUsuario));
	}
	
	public static PurpuraExcepcion crear(String mensajeTecnico,String mensajeUsuario) {
		return new PurpuraDominioExcepcion(mensajeTecnico, mensajeUsuario, new Exception(mensajeTecnico));
	}
	
	public static PurpuraExcepcion crear(String mensajeTecnico,String mensajeUsuario,Exception excepcionRaiz) {
		return new PurpuraDominioExcepcion(mensajeTecnico, mensajeUsuario,excepcionRaiz);
	}

}
