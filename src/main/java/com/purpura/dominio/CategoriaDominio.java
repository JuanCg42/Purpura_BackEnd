package com.purpura.dominio;

import java.util.UUID;


import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class CategoriaDominio {
	
	private UUID id;
	private String nombre;

	private CategoriaDominio(Builder builder) {

		this.id = builder.id;
		this.nombre = builder.nombre;
	}

	public UUID getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public static class Builder {

		private UUID id;
		private String nombre;

		public Builder() {
			id = UtilUUID.obtenerUUIDDefecto();
			nombre = UtilTexto.VACIA;
		}

		public Builder id(UUID id) {
			this.id = UtilUUID.obtenerValorDefecto(id);
			return this;
		}

		public Builder nombre(String nombre) {
			this.nombre = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(nombre);
			return this;
		}

		public CategoriaDominio build() {
			return new CategoriaDominio(this);
		}
	}


}
