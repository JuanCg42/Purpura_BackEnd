package com.purpura.dominio;

import java.time.LocalDateTime;
import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilFecha;

import com.purpura.transversal.utilitarios.UtilObjeto;

import com.purpura.transversal.utilitarios.UtilUUID;

public class HistorialEstadoClienteDominio {
	private VentaDominio venta;
	private ClienteDominio cliente;
	private TipoEstadoPagoDominio tipoEstadoPago;
	private UUID id;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;

	private HistorialEstadoClienteDominio(Builder builder) {
		this.venta = builder.venta;
		this.cliente = builder.cliente;
		this.tipoEstadoPago = builder.tipoEstadoPago;
		this.id = builder.id;
		this.fechaInicio = builder.fechaInicio;
		this.fechaFin = builder.fechaFin;

	}

	public VentaDominio getVenta() {
		return venta;
	}

	public ClienteDominio getCliente() {
		return cliente;
	}

	public TipoEstadoPagoDominio getTipoEstadoPago() {
		return tipoEstadoPago;
	}

	public UUID getId() {
		return id;
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public static class Builder {
		private VentaDominio venta;
		private ClienteDominio cliente;
		private TipoEstadoPagoDominio tipoEstadoPago;
		private UUID id;
		private LocalDateTime fechaInicio;

		private LocalDateTime fechaFin;

		public Builder() {
			venta = new VentaDominio.Builder().build();
			cliente = new ClienteDominio.Builder().build();
			tipoEstadoPago = new TipoEstadoPagoDominio.Builder().build();
			id = UtilUUID.obtenerUUIDDefecto();
			fechaInicio = UtilFecha.FECHA_HORA_DEFECTO;
			fechaFin = UtilFecha.FECHA_HORA_DEFECTO;
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

		public Builder tipoEstadoPago(TipoEstadoPagoDominio tipoEstadoPago) {
			this.tipoEstadoPago = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(tipoEstadoPago,
					new TipoEstadoPagoDominio.Builder().build());
			return this;
		}

		public Builder id(UUID id) {
			this.id = UtilUUID.obtenerValorDefecto(id);
			return this;
		}

		public Builder fechaInicio(LocalDateTime fechaInicio) {
			this.fechaInicio = UtilFecha.obtenerValorDefecto(fechaInicio);
			return this;

		}

		public Builder fechaFin(LocalDateTime fechaFin) {
			this.fechaFin = UtilFecha.obtenerValorDefecto(fechaFin);
			return this;

		}

		public HistorialEstadoClienteDominio build() {
			return new HistorialEstadoClienteDominio(this);
		}

	}

}
