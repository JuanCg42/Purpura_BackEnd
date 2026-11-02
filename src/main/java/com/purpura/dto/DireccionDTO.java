package com.purpura.dto;

import java.util.UUID;

import org.springframework.web.bind.annotation.BindParam;

import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class DireccionDTO {
	@BindParam("ciudad")
	private CiudadDTO ciudad;

	@BindParam("id")
	private UUID id;

	@BindParam("nombre")
	private String nombre;

	public DireccionDTO() {
		setId(UtilUUID.obtenerUUIDDefecto());
		setNombre(UtilTexto.VACIA);
		setCiudad(new CiudadDTO());
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = UtilUUID.obtenerValorDefecto(id);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(nombre);
	}

	public CiudadDTO getCiudad() {
		return ciudad;
	}

	public void setCiudad(CiudadDTO ciudad) {
		this.ciudad = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(ciudad, new CiudadDTO());
	}

}
