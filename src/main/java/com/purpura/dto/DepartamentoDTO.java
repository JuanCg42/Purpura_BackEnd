package com.purpura.dto;

import java.util.UUID;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;



public class DepartamentoDTO {
	
	private PaisDTO pais;
	private UUID id;
	private String nombre;
	
	
	
	public DepartamentoDTO() {
		setId(UtilUUID.obtenerUUIDDefecto());
		setNombre(UtilTexto.VACIA);
		setPais(new PaisDTO());
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



	public PaisDTO getPais() {
		return pais;
	}



	public void setPais(PaisDTO pais) {
		this.pais = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(pais, new PaisDTO());
	}
	
	

}
