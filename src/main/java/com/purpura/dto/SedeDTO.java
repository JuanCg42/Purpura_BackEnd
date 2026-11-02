package com.purpura.dto;

import java.util.UUID;

import org.springframework.web.bind.annotation.BindParam;

import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class SedeDTO {
	@BindParam("direccion")
	private DireccionDTO direccion;
	
	@BindParam("id")
	private UUID id;
	
	@BindParam("barrio")
	private String barrio;

	public SedeDTO() {
		setDireccion(new DireccionDTO());
		setId(UtilUUID.obtenerUUIDDefecto());
		setBarrio(UtilTexto.VACIA);

	}

	public DireccionDTO getDireccion() {
		return direccion;
	}

	public void setDireccion(DireccionDTO direccion) {
		this.direccion = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(direccion, new DireccionDTO());
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
