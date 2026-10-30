package com.purpura.transversal.excepciones;

import com.purpura.transversal.excepciones.enums.Capa;

public class PurpuraDTOExcepcion extends PurpuraExcepcion{

	protected PurpuraDTOExcepcion(Capa capa, String mensajeTecnico, String mensajeUsuario, Exception excepcionRaiz) {
		super(capa, mensajeTecnico, mensajeUsuario, excepcionRaiz);
	
	}

}
