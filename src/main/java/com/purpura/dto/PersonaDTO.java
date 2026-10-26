package com.purpura.dto;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class PersonaDTO {
	private TipoIdentificacionDTO tipoIdentificacion;
	private DireccionDTO direccion;
	private UUID id;
	private String numeroIdentificacion;
	private String nombre;
	private String telefono;
	private String correoElectronico;
	private boolean verificarNumero;
	private boolean verificarCorreo;

	public PersonaDTO() {
		setTipoIdentificacion(new TipoIdentificacionDTO());
		setDireccion(new DireccionDTO());
		setId(UtilUUID.obtenerUUIDDefecto());
		setNumeroIdentificacion(UtilTexto.VACIA);
		setNombre(UtilTexto.VACIA);
		setTelefono(UtilTexto.VACIA);
		setCorreoElectronico(UtilTexto.VACIA);
		setVerificarNumero(false);
		setVerificarCorreo(false);

	}

	public TipoIdentificacionDTO getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(TipoIdentificacionDTO tipoIdentificacion) {
		this.tipoIdentificacion = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(tipoIdentificacion,
				new TipoIdentificacionDTO());
	}

	public DireccionDTO getDireccion() {
		return direccion;
	}

	public void setDireccion(DireccionDTO direccion) {
		this.direccion = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(direccion, new DireccionDTO());
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = UtilUUID.obtenerValorDefecto(id);
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(numeroIdentificacion);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(nombre);
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(telefono);
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(correoElectronico);
	}

	public boolean isVerificarNumero() {
		return verificarNumero;
	}

	public void setVerificarNumero(boolean verificarNumero) {
		this.verificarNumero = verificarNumero;
	}

	public boolean isVerificarCorreo() {
		return verificarCorreo;
	}

	public void setVerificarCorreo(boolean verificarCorreo) {
		this.verificarCorreo = verificarCorreo;
	}

}
