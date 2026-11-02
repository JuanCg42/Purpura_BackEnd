package com.purpura.transversal.excepciones;

import com.purpura.transversal.excepciones.enums.Capa;

public class PurpuraDominioExcepcion extends PurpuraExcepcion {

	private static final long serialVersionUID = 1L;

	protected PurpuraDominioExcepcion(String mensajeUsuario, String mensajeTecnico, Exception excepcionRaiz) {
		super(Capa.DOMINIO, mensajeUsuario, mensajeTecnico, excepcionRaiz);

	}

	public static PurpuraExcepcion crear(String mensajeUsuario) {
		return new PurpuraDominioExcepcion(mensajeUsuario, mensajeUsuario, new Exception(mensajeUsuario));
	}
	
	public static PurpuraExcepcion crear(String mensajeUsuario,String mensajeTecnico) {
		return new PurpuraDominioExcepcion(mensajeUsuario, mensajeTecnico, new Exception(mensajeTecnico));
	}
	
	public static PurpuraExcepcion crear(String mensajeUsuario,String mensajeTecnico,Exception excepcionRaiz) {
		return new PurpuraDominioExcepcion(mensajeUsuario, mensajeTecnico,excepcionRaiz);
	}

}
