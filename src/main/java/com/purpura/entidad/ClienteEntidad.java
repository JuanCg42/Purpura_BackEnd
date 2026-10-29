package com.purpura.entidad;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public final class ClienteEntidad {
	private PersonaEntidad persona;
	private UUID id;

	public ClienteEntidad() {
		setPersona(new PersonaEntidad());
		setId(UtilUUID.obtenerUUIDDefecto());

	}

	public PersonaEntidad getPersona() {
		return persona;
	}

	public void setPersona(PersonaEntidad persona) {
		this.persona = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(persona, new PersonaEntidad());
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = UtilUUID.obtenerValorDefecto(id);
	}

}
