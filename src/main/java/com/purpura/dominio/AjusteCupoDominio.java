package com.purpura.dominio;

import java.time.LocalDateTime;
import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilFecha;
import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class AjusteCupoDominio {
	private CuentaPorCobrarDominio cuentaPorCobrar;
	private UUID id;
	private LocalDateTime fechaHora;
	private int cupoAnterior;
	private int cupoNuevo;
	private int diasMoraAcumulados;
	private String motivo;

	private AjusteCupoDominio(Builder builder) {
		this.cuentaPorCobrar = builder.cuentaPorCobrar;
		this.id = builder.id;
		this.fechaHora = builder.fechaHora;
		this.cupoAnterior = builder.cupoAnterior;
		this.cupoNuevo = builder.cupoNuevo;
		this.diasMoraAcumulados = builder.diasMoraAcumulados;
		this.motivo = builder.motivo;

	}

	public CuentaPorCobrarDominio getCuentaPorCobrar() {
		return cuentaPorCobrar;
	}

	public UUID getId() {
		return id;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public int getCupoAnterior() {
		return cupoAnterior;
	}

	public int getCupoNuevo() {
		return cupoNuevo;
	}

	public int getDiasMoraAcumulados() {
		return diasMoraAcumulados;
	}

	public String getMotivo() {
		return motivo;
	}

	public static class Builder {
		private CuentaPorCobrarDominio cuentaPorCobrar;

		private UUID id;
		private LocalDateTime fechaHora;
		private int cupoAnterior;
		private int cupoNuevo;
		private int diasMoraAcumulados;
		private String motivo;

		public Builder() {
			cuentaPorCobrar = new CuentaPorCobrarDominio.Builder().build();

			id = UtilUUID.obtenerUUIDDefecto();
			fechaHora = UtilFecha.FECHA_HORA_DEFECTO;
			cupoAnterior = UtilNumero.CERO;
			cupoNuevo = UtilNumero.CERO;
			diasMoraAcumulados = UtilNumero.CERO;
			motivo = UtilTexto.VACIA;

		}

		public Builder cuentaPorCobrar(CuentaPorCobrarDominio cuentaPorCobrar) {
			this.cuentaPorCobrar = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(cuentaPorCobrar,
					new CuentaPorCobrarDominio.Builder().build());
			return this;
		}

		public Builder id(UUID id) {
			this.id = UtilUUID.obtenerValorDefecto(id);
			return this;
		}

		public Builder fechaHora(LocalDateTime fechaHora) {
			this.fechaHora = UtilFecha.obtenerValorDefecto(fechaHora);
			return this;

		}

		public Builder cupoAnterior(int cupoAnterior) {
			this.cupoAnterior = cupoAnterior;
			return this;

		}

		public Builder cupoNuevo(int cupoNuevo) {
			this.cupoNuevo = cupoNuevo;
			return this;

		}

		public Builder diasMoraAcumulados(int diasMoraAcumulados) {
			this.diasMoraAcumulados = diasMoraAcumulados;
			return this;

		}

		public Builder motivo(String motivo) {
			this.motivo = motivo;
			return this;
		}

		public AjusteCupoDominio build() {
			return new AjusteCupoDominio(this);
		}

	}

}
