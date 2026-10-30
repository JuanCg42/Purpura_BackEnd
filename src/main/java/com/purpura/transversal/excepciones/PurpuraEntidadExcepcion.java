package com.purpura.transversal.excepciones;

import com.purpura.transversal.excepciones.enums.Capa;

public class PurpuraEntidadExcepcion extends PurpuraExcepcion {

	private static final long serialVersionUID = 1L;

	protected PurpuraEntidadExcepcion(String mensajeTecnico, String mensajeUsuario, Exception excepcionRaiz) {
		super(Capa.ENTIDAD, mensajeTecnico, mensajeUsuario, excepcionRaiz);

	}

	public static PurpuraExcepcion crear(String mensajeUsuario) {
		return new PurpuraEntidadExcepcion(mensajeUsuario, mensajeUsuario, new Exception(mensajeUsuario));
	}
	
	public static PurpuraExcepcion crear(String mensajeTecnico,String mensajeUsuario) {
		return new PurpuraEntidadExcepcion(mensajeTecnico, mensajeUsuario, new Exception(mensajeTecnico));
	}
	
	public static PurpuraExcepcion crear(String mensajeTecnico,String mensajeUsuario,Exception excepcionRaiz) {
		return new PurpuraEntidadExcepcion(mensajeTecnico, mensajeUsuario,excepcionRaiz);
	}

}
