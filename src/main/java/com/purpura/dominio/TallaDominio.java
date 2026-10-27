package com.purpura.dominio;

import java.util.UUID;


import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class TallaDominio {
	private UUID id;
	private String nombre;
	private TallajeDominio tallaje;

	private TallaDominio(Builder builder) {

		this.id = builder.id;
		this.nombre = builder.nombre;
		this.tallaje = builder.tallaje;
	}

	public UUID getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public TallajeDominio getTallaje() {
		return tallaje;
	}

	public static class Builder {

		private UUID id;
		private String nombre;
		private TallajeDominio tallaje;

		public Builder() {
			id = UtilUUID.obtenerUUIDDefecto();
			nombre = UtilTexto.VACIA;
			tallaje = new TallajeDominio.Builder().build();
		}

		public Builder id(UUID id) {
			this.id = UtilUUID.obtenerValorDefecto(id);
			return this;
		}

		public Builder nombre(String nombre) {
			this.nombre = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(nombre);
			return this;
		}

		public Builder tallaje(TallajeDominio tallaje) {
			this.tallaje = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(tallaje, new TallajeDominio.Builder().build());
			return this;
		}

		
		public TallaDominio build() {
			return new TallaDominio(this);
		}
	}

}
