package com.purpura.dominio;

import java.time.LocalDateTime;
import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilFecha;
import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class TrasladoDominio {
	private ProductoSedeDominio productoSede;
	private SedeDominio sede;
	private EmpleadoDominio empleado;
	private UUID id;
	private LocalDateTime fechaHora;
	private int cantidad;

	private TrasladoDominio(Builder builder) {
		this.productoSede = builder.productoSede;
		this.sede = builder.sede;
		this.empleado = builder.empleado;
		this.id = builder.id;
		this.fechaHora = builder.fechaHora;
		this.cantidad = builder.cantidad;

	}

	public ProductoSedeDominio getProductoSede() {
		return productoSede;
	}

	public SedeDominio getSede() {
		return sede;
	}

	public EmpleadoDominio getEmpleado() {
		return empleado;
	}

	public UUID getId() {
		return id;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public int getCantidad() {
		return cantidad;
	}

	public static class Builder {
		private ProductoSedeDominio productoSede;
		private SedeDominio sede;

		private EmpleadoDominio empleado;
		private UUID id;
		private LocalDateTime fechaHora;
		private int cantidad;

		public Builder() {
			productoSede = new ProductoSedeDominio.Builder().build();
			sede = new SedeDominio.Builder().build();

			empleado = new EmpleadoDominio.Builder().build();
			id = UtilUUID.obtenerUUIDDefecto();
			fechaHora = UtilFecha.FECHA_HORA_DEFECTO;
			cantidad = UtilNumero.CERO;

		}

		public Builder productoSede(ProductoSedeDominio productoSede) {
			this.productoSede = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(productoSede,
					new ProductoSedeDominio.Builder().build());
			return this;
		}

		public Builder sede(SedeDominio sede) {
			this.sede = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(sede, new SedeDominio.Builder().build());
			return this;
		}

		public Builder empleado(EmpleadoDominio empleado) {
			this.empleado = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(empleado,
					new EmpleadoDominio.Builder().build());
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

		public Builder cantidad(int cantidad) {
			this.cantidad = cantidad;
			return this;

		}

		public TrasladoDominio build() {
			return new TrasladoDominio(this);
		}

	}

}
