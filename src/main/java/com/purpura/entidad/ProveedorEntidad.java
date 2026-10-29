package com.purpura.entidad;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class ProveedorEntidad {

	private PersonaEntidad persona;
	private UUID id;
	private String nombreVendedor;
	private boolean activo;

	public ProveedorEntidad() {
		setPersona(new PersonaEntidad());
		setId(UtilUUID.obtenerUUIDDefecto());
		setNombreVendedor(UtilTexto.VACIA);
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

	public String getNombreVendedor() {
		return nombreVendedor;
	}

	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(nombreVendedor);
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

}
