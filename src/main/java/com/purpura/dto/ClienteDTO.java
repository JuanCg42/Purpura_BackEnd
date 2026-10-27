package com.purpura.dto;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class ClienteDTO {
	private PersonaDTO persona;
	private UUID id;

	public ClienteDTO() {
		setPersona(new PersonaDTO());
		setId(UtilUUID.obtenerUUIDDefecto());

	}

	public PersonaDTO getPersona() {
		return persona;
	}

	public void setPersona(PersonaDTO persona) {
		this.persona = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(persona, new PersonaDTO());
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = UtilUUID.obtenerValorDefecto(id);
	}

}
