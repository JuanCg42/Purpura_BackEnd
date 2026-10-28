package com.purpura.dominio;

import java.time.LocalDateTime;
import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilFecha;
import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class SaldoAFavorDominio {
	private VentaDominio venta;
	private ClienteDominio cliente;
	private UUID id;
	private int monto;
	private boolean disponible;
	private LocalDateTime fechaHora;
	private LocalDateTime fechaConsumo;

	private SaldoAFavorDominio(Builder builder) {
		this.venta = builder.venta;
		this.cliente = builder.cliente;
		this.monto = builder.monto;
		this.disponible = builder.disponible;
		this.id = builder.id;
		this.fechaHora = builder.fechaHora;
		this.fechaConsumo = builder.fechaConsumo;

	}

	public VentaDominio getVenta() {
		return venta;
	}

	public ClienteDominio getCliente() {
		return cliente;
	}

	public UUID getId() {
		return id;
	}

	public int getMonto() {
		return monto;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public LocalDateTime getFechaConsumo() {
		return fechaConsumo;
	}

	public static class Builder {
		private VentaDominio venta;
		private ClienteDominio cliente;
		private int monto;
		private boolean disponible;
		private UUID id;
		private LocalDateTime fechaHora;

		private LocalDateTime fechaConsumo;

		public Builder() {
			venta = new VentaDominio.Builder().build();
			cliente = new ClienteDominio.Builder().build();
			id = UtilUUID.obtenerUUIDDefecto();
			monto = UtilNumero.CERO;
			disponible = true;
			fechaHora = UtilFecha.FECHA_HORA_DEFECTO;
			fechaConsumo = UtilFecha.FECHA_HORA_DEFECTO;
		}

		public Builder venta(VentaDominio venta) {
			this.venta = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(venta, new VentaDominio.Builder().build());
			return this;
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

		public Builder monto(int monto) {
			this.monto = monto;
			return this;
		}

		public Builder disponible(boolean disponible) {
			this.disponible = disponible;
			return this;
		}

		public Builder fechaHora(LocalDateTime fechaHora) {
			this.fechaHora = UtilFecha.obtenerValorDefecto(fechaHora);
			return this;

		}

		public Builder fechaConsumo(LocalDateTime fechaConsumo) {
			this.fechaConsumo = UtilFecha.obtenerValorDefecto(fechaConsumo);
			return this;

		}

		public SaldoAFavorDominio build() {
			return new SaldoAFavorDominio(this);
		}

	}

}
