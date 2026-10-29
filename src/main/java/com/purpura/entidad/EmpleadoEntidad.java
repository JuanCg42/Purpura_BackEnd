package com.purpura.entidad;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class EmpleadoEntidad {

	private PersonaEntidad persona;
	private UUID id;
	private boolean activo;

	public EmpleadoEntidad() {
		setPersona(new PersonaEntidad());
		setId(UtilUUID.obtenerUUIDDefecto());
		setActivo(true);

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

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

}
