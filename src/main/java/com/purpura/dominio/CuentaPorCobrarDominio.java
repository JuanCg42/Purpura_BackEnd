package com.purpura.dominio;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class CuentaPorCobrarDominio {

	private ClienteDominio cliente;
	private UUID id;
	private String codigoCartera;
	private int total;
	private int pendiente;
	private int cupoMaximo;
	private int cupoDisponible;

	private CuentaPorCobrarDominio(Builder builder) {
		this.cliente = builder.cliente;
		this.id = builder.id;
		this.codigoCartera = builder.codigoCartera;
		this.total = builder.total;
		this.pendiente = builder.pendiente;
		this.cupoMaximo = builder.cupoMaximo;
		this.cupoDisponible = builder.cupoDisponible;

	}

	public ClienteDominio getCliente() {
		return cliente;
	}

	public UUID getId() {
		return id;
	}

	public String getCodigoCartera() {
		return codigoCartera;
	}

	public int getTotal() {
		return total;
	}

	public int getPendiente() {
		return pendiente;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}

	public int getCupoDisponible() {
		return cupoDisponible;
	}

	public static class Builder {
		private ClienteDominio cliente;
		private UUID id;
		private String codigoCartera;
		private int total;
		private int pendiente;
		private int cupoMaximo;
		private int cupoDisponible;

		public Builder() {
			cliente = new ClienteDominio.Builder().build();
			id = UtilUUID.obtenerUUIDDefecto();
			codigoCartera = UtilTexto.VACIA;
			total = UtilNumero.CERO;
			pendiente = UtilNumero.CERO;
			cupoMaximo = UtilNumero.CERO;
			cupoDisponible = UtilNumero.CERO;

		}

		public Builder cliente(ClienteDominio cliente) {
			this.cliente = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(cliente,
					new ClienteDominio.Builder().build());
			return this;
		}

		public Builder id(UUID id) {
			this.id = UtilUUID.obtenerValorDefecto(id);
			return this;
		}

		public Builder codigoCartera(String codigoCartera) {
			this.codigoCartera = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(codigoCartera);
			return this;
		}

		public Builder total(int total) {
			this.total = total;
			return this;
		}

		public Builder pendiente(int pendiente) {
			this.pendiente = pendiente;
			return this;
		}

		public Builder cupoMaximo(int cupoMaximo) {
			this.cupoMaximo = cupoMaximo;
			return this;
		}

		public Builder cupoDisponible(int cupoDisponible) {
			this.cupoDisponible = cupoDisponible;
			return this;
		}

		public CuentaPorCobrarDominio build() {
			return new CuentaPorCobrarDominio(this);
		}

	}

}
