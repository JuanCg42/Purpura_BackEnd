package com.purpura.dominio;

import java.util.UUID;


import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class TipoIdentificacionDominio {
	private UUID id;
	private String nombre;
	private String descripcion;

	private TipoIdentificacionDominio(Builder builder) {

		this.id = builder.id;
		this.nombre = builder.nombre;
		this.descripcion= builder.descripcion;
	}

	public UUID getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public static class Builder {

		private UUID id;
		private String nombre;
		private String descripcion;

		public Builder() {
			id = UtilUUID.obtenerUUIDDefecto();
			nombre = UtilTexto.VACIA;
			descripcion = UtilTexto.VACIA;
		}

		public Builder id(UUID id) {
			this.id = UtilUUID.obtenerValorDefecto(id);
			return this;
		}

		public Builder nombre(String nombre) {
			this.nombre = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(nombre);
			return this;
		}

		public Builder descripcion(String descripcion) {
			this.descripcion = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(descripcion);
			return this;
		}

		public TipoIdentificacionDominio build() {
			return new TipoIdentificacionDominio(this);
		}

	}

}
