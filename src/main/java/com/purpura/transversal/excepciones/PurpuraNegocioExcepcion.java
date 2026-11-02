package com.purpura.transversal.excepciones;

import com.purpura.transversal.excepciones.enums.Capa;

public class PurpuraNegocioExcepcion extends PurpuraExcepcion {

	private static final long serialVersionUID = 1L;

	protected PurpuraNegocioExcepcion(String mensajeUsuario, String mensajeTecnico, Exception excepcionRaiz) {
		super(Capa.NEGOCIO, mensajeUsuario, mensajeTecnico, excepcionRaiz);

	}

	public static PurpuraExcepcion crear(String mensajeUsuario) {
		return new PurpuraNegocioExcepcion(mensajeUsuario, mensajeUsuario, new Exception(mensajeUsuario));
	}
	
	public static PurpuraExcepcion crear(String mensajeUsuario,String mensajeTecnico) {
		return new PurpuraNegocioExcepcion(mensajeUsuario, mensajeTecnico, new Exception(mensajeTecnico));
	}
	
	public static PurpuraExcepcion crear(String mensajeUsuario,String mensajeTecnico,Exception excepcionRaiz) {
		return new PurpuraNegocioExcepcion(mensajeUsuario, mensajeTecnico,excepcionRaiz);
	}

}
