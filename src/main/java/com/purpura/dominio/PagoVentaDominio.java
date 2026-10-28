package com.purpura.dominio;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class PagoVentaDominio {

	private VentaDominio codigoVenta;
	private FormaPagoDominio formaPago;
	private UUID id;
	private int monto;

	private PagoVentaDominio(Builder builder) {
		this.codigoVenta = builder.codigoVenta;
		this.formaPago = builder.formaPago;
		this.monto = builder.monto;
		this.id = builder.id;

	}

	public VentaDominio getCodigoVenta() {
		return codigoVenta;
	}

	public FormaPagoDominio getFormaPago() {
		return formaPago;
	}

	public UUID getId() {
		return id;
	}

	public int getMonto() {
		return monto;
	}

	public static class Builder {
		private VentaDominio codigoVenta;
		private FormaPagoDominio formaPago;
		private int monto;
		private UUID id;

		public Builder() {
			codigoVenta = new VentaDominio.Builder().build();
			formaPago = new FormaPagoDominio.Builder().build();
			id = UtilUUID.obtenerUUIDDefecto();
			monto = UtilNumero.CERO;

		}

		public Builder codigoVenta(VentaDominio codigoVenta) {
			this.codigoVenta = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(codigoVenta,
					new VentaDominio.Builder().build());
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

		public Builder monto(int monto) {
			this.monto = monto;
			return this;
		}

		public PagoVentaDominio build() {
			return new PagoVentaDominio(this);
		}

	}

}
