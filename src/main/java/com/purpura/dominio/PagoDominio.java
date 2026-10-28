package com.purpura.dominio;

import java.time.LocalDateTime;
import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilFecha;
import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class PagoDominio {
	private CuentaPorCobrarDominio cuentaPorCobrar;
	private FormaPagoDominio formaPago;
	private UUID id;
	private LocalDateTime fechaHora;
	private int abono;

	private PagoDominio(Builder builder) {
		this.cuentaPorCobrar = builder.cuentaPorCobrar;
		this.formaPago = builder.formaPago;
		this.id = builder.id;
		this.fechaHora = builder.fechaHora;
		this.abono = builder.abono;
	}

	public CuentaPorCobrarDominio getCuentaPorCobrar() {
		return cuentaPorCobrar;
	}

	public FormaPagoDominio getFormaPago() {
		return formaPago;
	}

	public UUID getId() {
		return id;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public int getAbono() {
		return abono;
	}

	public static class Builder {

		private CuentaPorCobrarDominio cuentaPorCobrar;
		private FormaPagoDominio formaPago;
		private UUID id;
		private LocalDateTime fechaHora;
		private int abono;

		public Builder() {
			cuentaPorCobrar = new CuentaPorCobrarDominio.Builder().build();
			formaPago = new FormaPagoDominio.Builder().build();
			id = UtilUUID.obtenerUUIDDefecto();
			fechaHora = UtilFecha.FECHA_HORA_DEFECTO;
			abono = UtilNumero.CERO;

		}

		public Builder cuentaPorCobrar(CuentaPorCobrarDominio cuentaPorCobrar) {
			this.cuentaPorCobrar = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(cuentaPorCobrar,
					new CuentaPorCobrarDominio.Builder().build());
			return this;
		}

		public Builder formaPago(FormaPagoDominio formaPago) {
			this.formaPago = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(formaPago,
					new FormaPagoDominio.Builder().build());
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

		public Builder abono(int abono) {
			this.abono = abono;
			return this;
		}
		
		public PagoDominio build() {
			return new PagoDominio(this);
		}

	}
}
