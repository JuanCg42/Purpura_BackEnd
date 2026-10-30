package com.purpura.transversal.excepciones;

import com.purpura.transversal.excepciones.enums.Capa;

public class PurpuraFachadaExcepcion extends PurpuraExcepcion {

	private static final long serialVersionUID = 1L;

	protected PurpuraFachadaExcepcion(String mensajeTecnico, String mensajeUsuario, Exception excepcionRaiz) {
		super(Capa.FACHADA, mensajeTecnico, mensajeUsuario, excepcionRaiz);

	}

	public static PurpuraExcepcion crear(String mensajeUsuario) {
		return new PurpuraFachadaExcepcion(mensajeUsuario, mensajeUsuario, new Exception(mensajeUsuario));
	}
	
	public static PurpuraExcepcion crear(String mensajeTecnico,String mensajeUsuario) {
		return new PurpuraFachadaExcepcion(mensajeTecnico, mensajeUsuario, new Exception(mensajeTecnico));
	}
	
	public static PurpuraExcepcion crear(String mensajeTecnico,String mensajeUsuario,Exception excepcionRaiz) {
		return new PurpuraFachadaExcepcion(mensajeTecnico, mensajeUsuario,excepcionRaiz);
	}

}
