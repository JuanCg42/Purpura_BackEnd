package com.purpura.entidad;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class SedeEntidad {
	private DireccionEntidad direccion;
	private UUID id;
	private String barrio;

	public SedeEntidad() {
		setDireccion(new DireccionEntidad());
		setId(UtilUUID.obtenerUUIDDefecto());
		setBarrio(UtilTexto.VACIA);

	}

	public DireccionEntidad getDireccion() {
		return direccion;
	}

	public void setDireccion(DireccionEntidad direccion) {
		this.direccion = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(direccion, new DireccionEntidad());
		;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = UtilUUID.obtenerValorDefecto(id);
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(barrio);
	}

}
