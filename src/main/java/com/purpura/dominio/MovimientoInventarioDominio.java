package com.purpura.dominio;

import java.time.LocalDateTime;
import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilFecha;
import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class MovimientoInventarioDominio {
	private ProductoSedeDominio productoSede;
	private TipoMovimientoDominio tipoMovimiento;
	private UUID id;
	private int cantidad;
	private String observacion;
	private LocalDateTime fechaHora;

	private MovimientoInventarioDominio(Builder builder) {
		this.productoSede = builder.productoSede;
		this.tipoMovimiento = builder.tipoMovimiento;
		this.cantidad = builder.cantidad;
		this.id = builder.id;
		this.observacion = builder.observacion;
		this.fechaHora = builder.fechaHora;

	}

	public ProductoSedeDominio getProductoSede() {
		return productoSede;
	}

	public TipoMovimientoDominio getTipoMovimiento() {
		return tipoMovimiento;
	}

	public UUID getId() {
		return id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public String getObservacion() {
		return observacion;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public static class Builder {
		private ProductoSedeDominio productoSede;
		private TipoMovimientoDominio tipoMovimiento;
		private int cantidad;
		private UUID id;
		private String observacion;
		private LocalDateTime fechaHora;

		public Builder() {
			productoSede = new ProductoSedeDominio.Builder().build();
			tipoMovimiento = new TipoMovimientoDominio.Builder().build();
			id = UtilUUID.obtenerUUIDDefecto();
			observacion = UtilTexto.VACIA;
			fechaHora = UtilFecha.FECHA_HORA_DEFECTO;
			cantidad = UtilNumero.CERO;

		}

		public Builder productoSede(ProductoSedeDominio productoSede) {
			this.productoSede = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(productoSede,
					new ProductoSedeDominio.Builder().build());
			return this;
		}

		public Builder tipoMovimiento(TipoMovimientoDominio tipoMovimiento) {
			this.tipoMovimiento = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(tipoMovimiento,
					new TipoMovimientoDominio.Builder().build());
			return this;
		}

		public Builder id(UUID id) {
			this.id = UtilUUID.obtenerValorDefecto(id);
			return this;
		}

		public Builder cantidad(int cantidad) {
			this.cantidad = cantidad;
			return this;
		}

		public Builder observacion(String observacion) {
			this.observacion = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(observacion);
			return this;
		}

		public Builder fechaHora(LocalDateTime fechaHora) {
			this.fechaHora = UtilFecha.obtenerValorDefecto(fechaHora);
			return this;
		}

		public MovimientoInventarioDominio build() {
			return new MovimientoInventarioDominio(this);
		}

	}

}
