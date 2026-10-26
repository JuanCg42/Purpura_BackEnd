package com.purpura.dto;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class TallaDTO {
	private TallajeDTO tallaje;
	private UUID id;
	private String nombre;
	
	
	
	
	public TallaDTO() {
		setId(UtilUUID.obtenerUUIDDefecto());
		setNombre(UtilTexto.VACIA);
		setTallaje(new TallajeDTO());
	}
	
	
	
	public UUID getId() {
		return id;
	}
	
	public void setId(UUID id) {
		this.id=  UtilUUID.obtenerValorDefecto(id);
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(nombre);
	}



	public TallajeDTO getTallaje() {
		return tallaje;
	}



	public void setTallaje(TallajeDTO tallaje) {
		this.tallaje = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(tallaje, new TallajeDTO());
	}
	
	

}
