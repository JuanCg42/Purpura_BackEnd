package com.purpura.transversal.excepciones;

import com.purpura.transversal.excepciones.enums.Capa;

public class PurpuraDTOExcepcion extends PurpuraExcepcion {

	private static final long serialVersionUID = 1L;

	protected PurpuraDTOExcepcion(String mensajeUsuario, String mensajeTecnico, Exception excepcionRaiz) {
		super(Capa.DTO, mensajeUsuario, mensajeTecnico, excepcionRaiz);

	}

	public static PurpuraExcepcion crear(String mensajeUsuario) {
		return new PurpuraDTOExcepcion(mensajeUsuario, mensajeUsuario, new Exception(mensajeUsuario));
	}

	public static PurpuraExcepcion crear(String mensajeUsuario, String mensajeTecnico) {
		return new PurpuraDTOExcepcion(mensajeUsuario, mensajeTecnico, new Exception(mensajeTecnico));
	}

	public static PurpuraExcepcion crear(String mensajeUsuario, String mensajeTecnico, Exception excepcionRaiz) {
		return new PurpuraDTOExcepcion(mensajeUsuario, mensajeTecnico, excepcionRaiz);
	}

}
