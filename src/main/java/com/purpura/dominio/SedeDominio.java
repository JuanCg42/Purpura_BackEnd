package com.purpura.dominio;

import java.util.UUID;


import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class SedeDominio {
	private UUID id;
	private String barrio;
	private DireccionDominio direccion;

	private SedeDominio(Builder builder) {

		this.id = builder.id;
		this.barrio = builder.barrio;
		this.direccion = builder.direccion;
	}

	public UUID getId() {
		return id;
	}

	public String getBarrio() {
		return barrio;
	}

	public DireccionDominio getDireccion() {
		return direccion;
	}

	public static class Builder {

		private UUID id;
		private String barrio;
		private DireccionDominio direccion;

		public Builder() {
			id = UtilUUID.obtenerUUIDDefecto();
			barrio = UtilTexto.VACIA;
			direccion = new DireccionDominio.Builder().build();
		}

		public Builder id(UUID id) {
			this.id = UtilUUID.obtenerValorDefecto(id);
			return this;
		}

		public Builder barrio(String barrio) {
			this.barrio = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(barrio);
			return this;
		}

		public Builder direccion(DireccionDominio direccion) {
			this.direccion = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(direccion, new DireccionDominio.Builder().build());
			return this;
		}

		public SedeDominio build() {
			return new SedeDominio(this);
		}
	}

}
