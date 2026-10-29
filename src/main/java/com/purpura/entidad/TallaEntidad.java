package com.purpura.entidad;

import java.util.UUID;

import org.springframework.web.bind.annotation.BindParam;

import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class TallaEntidad {

	@BindParam("tallaje")
	private TallajeEntidad tallaje;

	@BindParam("id")
	private UUID id;

	@BindParam("nombre")
	private String nombre;

	public TallaEntidad() {
		setId(UtilUUID.obtenerUUIDDefecto());
		setNombre(UtilTexto.VACIA);
		setTallaje(new TallajeEntidad());
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = UtilUUID.obtenerValorDefecto(id);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(nombre);
	}

	public TallajeEntidad getTallaje() {
		return tallaje;
	}

	public void setTallaje(TallajeEntidad tallaje) {
		this.tallaje = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(tallaje, new TallajeEntidad());
	}

}
