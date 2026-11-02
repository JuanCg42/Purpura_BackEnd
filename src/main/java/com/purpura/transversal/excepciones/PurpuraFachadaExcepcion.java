package com.purpura.transversal.excepciones;

import com.purpura.transversal.excepciones.enums.Capa;

public class PurpuraFachadaExcepcion extends PurpuraExcepcion {

	private static final long serialVersionUID = 1L;

	protected PurpuraFachadaExcepcion(String mensajeUsuario, String mensajeTecnico, Exception excepcionRaiz) {
		super(Capa.FACHADA, mensajeUsuario, mensajeTecnico, excepcionRaiz);

	}

	public static PurpuraExcepcion crear(String mensajeUsuario) {
		return new PurpuraFachadaExcepcion(mensajeUsuario, mensajeUsuario, new Exception(mensajeUsuario));
	}
	
	public static PurpuraExcepcion crear(String mensajeUsuario,String mensajeTecnico) {
		return new PurpuraFachadaExcepcion(mensajeUsuario, mensajeTecnico, new Exception(mensajeTecnico));
	}
	
	public static PurpuraExcepcion crear(String mensajeUsuario,String mensajeTecnico,Exception excepcionRaiz) {
		return new PurpuraFachadaExcepcion(mensajeUsuario, mensajeTecnico,excepcionRaiz);
	}

}
