package com.purpura.dominio;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class ClienteDominio {
	private UUID id;
	private PersonaDominio persona;

	private ClienteDominio(Builder builder) {

		this.id = builder.id;
		this.persona = builder.persona;
	}

	public UUID getId() {
		return id;
	}

	public PersonaDominio getPersona() {
		return persona;
	}

	public static class Builder {

		private UUID id;
		private PersonaDominio persona;

		public Builder() {
			id = UtilUUID.obtenerUUIDDefecto();
			persona = new PersonaDominio.Builder().build();
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

		public ClienteDominio build() {
			return new ClienteDominio(this);
		}
	}
}
