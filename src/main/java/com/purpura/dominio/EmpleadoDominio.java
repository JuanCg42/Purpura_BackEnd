package com.purpura.dominio;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class EmpleadoDominio {

	private UUID id;
	private PersonaDominio persona;
	private boolean activo;

	private EmpleadoDominio(Builder builder) {

		this.id = builder.id;
		this.persona = builder.persona;
		this.activo = builder.activo;
	}

	public UUID getId() {
		return id;
	}

	public PersonaDominio getPersona() {
		return persona;
	}

	public boolean isActivo() {
		return activo;
	}

	public static class Builder {

		private UUID id;
		private PersonaDominio persona;
		private boolean activo;

		public Builder() {
			id = UtilUUID.obtenerUUIDDefecto();
			persona = new PersonaDominio.Builder().build();
			activo = false;
		}

		public Builder id(UUID id) {
			this.id = UtilUUID.obtenerValorDefecto(id);
			return this;
		}

		public Builder persona(PersonaDominio persona) {
			this.persona = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(persona,
					new PersonaDominio.Builder().build());
			return this;
		}

		public Builder activo(boolean activo) {
			this.activo = activo;
			return this;
		}

		public EmpleadoDominio build() {
			return new EmpleadoDominio(this);
		}
	}

}
