package com.purpura.dominio;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class PersonaDominio {
	private TipoIdentificacionDominio tipoIdentificacion;
	private DireccionDominio direccion;
	private UUID id;
	private String numeroIdentificacion;
	private String nombre;
	private String telefono;
	private String correoElectronico;
	private boolean verificarNumero;
	private boolean verificarCorreo;

	private PersonaDominio(Builder builder) {
		this.tipoIdentificacion= builder.tipoIdentificacion;
		this.direccion=builder.direccion;
		this.id= builder.id;
		this.numeroIdentificacion= builder.numeroIdentificacion;
		this.nombre= builder.nombre;
		this.telefono=builder.telefono;
		this.correoElectronico= builder.correoElectronico;
		this.verificarNumero= builder.verificarNumero;
		this.verificarCorreo=builder.verificarCorreo;
	
		
		

	}

	public TipoIdentificacionDominio getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public DireccionDominio getDireccion() {
		return direccion;
	}

	public UUID getId() {
		return id;
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public boolean isVerificarNumero() {
		return verificarNumero;
	}

	public boolean isVerificarCorreo() {
		return verificarCorreo;
	}

	public static class Builder {
		private TipoIdentificacionDominio tipoIdentificacion;
		private DireccionDominio direccion;
		private UUID id;
		private String numeroIdentificacion;
		private String nombre;
		private String telefono;
		private String correoElectronico;
		private boolean verificarNumero;
		private boolean verificarCorreo;

		public Builder() {

			id = UtilUUID.obtenerUUIDDefecto();
			nombre = UtilTexto.VACIA;
			tipoIdentificacion = new TipoIdentificacionDominio.Builder().build();
			direccion = new DireccionDominio.Builder().build();
			telefono = UtilTexto.VACIA;
			correoElectronico= UtilTexto.VACIA;
			numeroIdentificacion= UtilTexto.VACIA;
			verificarNumero= false;
			verificarCorreo= false;
			
					

		}

		public Builder nombre(String nombre) {
			this.nombre = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(nombre);
			return this;
		}

		public Builder id(UUID id) {
			this.id = UtilUUID.obtenerValorDefecto(id);
			return this;
		}

		public Builder tipoIdentificacion(TipoIdentificacionDominio tipoIdentificacion) {
			this.tipoIdentificacion = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(tipoIdentificacion,
					new TipoIdentificacionDominio.Builder().build());
			return this;
		}

		public Builder direccion(DireccionDominio direccion) {
			this.direccion = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(direccion,
					new DireccionDominio.Builder().build());
			return this;
		}

		public Builder telefono(String telefono) {
			this.telefono = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(telefono);
			return this;
		}
		
		public Builder correoElectronico(String correoElectronico) {
			this.correoElectronico = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(correoElectronico);
			return this;
		}
		
		public Builder numeroIdentificacion(String numeroIdentificacion) {
			this.numeroIdentificacion = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(numeroIdentificacion);
			return this;
		}
		
		public Builder verificarNumero(boolean verificarNumero) {
			this.verificarNumero = verificarNumero;
			return this;
		}

		public Builder verificarCorreo(boolean verificarCorreo) {
			this.verificarCorreo = verificarCorreo;
			return this;
		}
		
		
		
		public PersonaDominio build() {
			return new PersonaDominio(this);

		}

}
}
