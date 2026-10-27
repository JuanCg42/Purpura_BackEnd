package com.purpura.dominio;

import java.util.UUID;


import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class DireccionDominio {
	private UUID id;
	private String nombre;
	private CiudadDominio ciudad;

	private DireccionDominio(Builder builder) {

		this.id = builder.id;
		this.nombre = builder.nombre;
		this.ciudad = builder.ciudad;
	}

	public UUID getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public CiudadDominio getCiudad() {
		return ciudad;
	}

	public static class Builder {

		private UUID id;
		private String nombre;
		private CiudadDominio ciudad;

		public Builder() {
			id = UtilUUID.obtenerUUIDDefecto();
			nombre = UtilTexto.VACIA;
			ciudad = new CiudadDominio.Builder().build();
		}

		public Builder id(UUID id) {
			this.id = UtilUUID.obtenerValorDefecto(id);
			return this;
		}

		public Builder nombre(String nombre) {
			this.nombre = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(nombre);
			return this;
		}

		public Builder ciudad(CiudadDominio ciudad) {
			this.ciudad = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(ciudad, new CiudadDominio.Builder().build());
			return this;
		}

		public DireccionDominio build() {
			return new DireccionDominio(this);
		}
	}

}
