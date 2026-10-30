package com.purpura.transversal.excepciones;

import com.purpura.transversal.excepciones.enums.Capa;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;

public class PurpuraExcepcion extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private Capa capa;
	private String mensajeTecnico;
	private String mensajeUsuario;
	private Exception excepcionRaiz;

	protected PurpuraExcepcion(Capa capa, String mensajeTecnico, String mensajeUsuario, Exception excepcionRaiz) {
		super();
		setCapa(capa);
		setMensajeUsuario(mensajeUsuario);
		setMensajeTecnico(mensajeTecnico);
		setExcepcionRaiz(excepcionRaiz);

	}

	@Override
	public String getMessage() {
		return getMensajeTecnico();
	}

	public Capa getCapa() {
		return capa;
	}

	public String getMensajeTecnico() {
		return mensajeTecnico;
	}

	public String getMensajeUsuario() {
		return mensajeUsuario;
	}

	public Exception getExcepcionRaiz() {
		return excepcionRaiz;
	}

	private void setCapa(Capa capa) {
		this.capa = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(capa, Capa.GENERAL);
	}

	private void setMensajeTecnico(String mensajeTecnico) {
		this.mensajeTecnico = UtilTexto.getUtilTexto().obtenerValorDefecto(mensajeTecnico,getMensajeUsuario());
	}

	private void setMensajeUsuario(String mensajeUsuario) {
		this.mensajeUsuario = UtilTexto.getUtilTexto().obtenerValorDefecto(mensajeUsuario);
	}

	private void setExcepcionRaiz(Exception excepcionRaiz) {
		this.excepcionRaiz = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(excepcionRaiz,
				new Exception(getMensajeTecnico()));
	}

}
