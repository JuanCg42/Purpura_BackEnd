package com.purpura.dominio;

import java.time.LocalDateTime;
import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilFecha;
import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class VentaDominio {
	private CuentaPorCobrarDominio cuentaPorCobrar;
	private SedeDominio sede;
	private TipoEstadoPagoDominio tipoEstadoPago;
	private EmpleadoDominio empleado;
	private UUID id;
	private LocalDateTime fechaHora;
	private int plazoDia;
	private LocalDateTime fechaLimitePago;
	private String codigoVenta;
	private boolean confirmada;
	private boolean anulada;
	private LocalDateTime fechaAnulacion;

	private VentaDominio(Builder builder) {
		this.cuentaPorCobrar = builder.cuentaPorCobrar;
		this.sede = builder.sede;
		this.tipoEstadoPago = builder.tipoEstadoPago;
		this.empleado = builder.empleado;
		this.id = builder.id;
		this.fechaHora = builder.fechaHora;
		this.plazoDia = builder.plazoDia;
		this.fechaLimitePago = builder.fechaLimitePago;
		this.codigoVenta = builder.codigoVenta;
		this.confirmada = builder.confirmada;
		this.anulada = builder.anulada;
		this.fechaAnulacion = builder.fechaAnulacion;

	}

	public CuentaPorCobrarDominio getCuentaPorCobrar() {
		return cuentaPorCobrar;
	}

	public SedeDominio getSede() {
		return sede;
	}

	public TipoEstadoPagoDominio getTipoEstadoPago() {
		return tipoEstadoPago;
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

	public int getPlazoDia() {
		return plazoDia;
	}

	public LocalDateTime getFechaLimitePago() {
		return fechaLimitePago;
	}

	public String getCodigoVenta() {
		return codigoVenta;
	}

	public boolean isConfirmada() {
		return confirmada;
	}

	public boolean isAnulada() {
		return anulada;
	}

	public LocalDateTime getFechaAnulacion() {
		return fechaAnulacion;
	}

	public static class Builder {
		private CuentaPorCobrarDominio cuentaPorCobrar;
		private SedeDominio sede;
		private TipoEstadoPagoDominio tipoEstadoPago;
		private EmpleadoDominio empleado;
		private UUID id;
		private LocalDateTime fechaHora;
		private int plazoDia;
		private LocalDateTime fechaLimitePago;
		private String codigoVenta;
		private boolean confirmada;
		private boolean anulada;
		private LocalDateTime fechaAnulacion;

		public Builder() {
			cuentaPorCobrar = new CuentaPorCobrarDominio.Builder().build();
			sede = new SedeDominio.Builder().build();
			tipoEstadoPago = new TipoEstadoPagoDominio.Builder().build();
			empleado = new EmpleadoDominio.Builder().build();
			id = UtilUUID.obtenerUUIDDefecto();
			fechaHora = UtilFecha.FECHA_HORA_DEFECTO;
			plazoDia = UtilNumero.CERO;
			fechaLimitePago = UtilFecha.FECHA_HORA_DEFECTO;
			codigoVenta = UtilTexto.VACIA;
			confirmada = false;
			anulada = false;
			fechaAnulacion = UtilFecha.FECHA_HORA_DEFECTO;
		}

		public Builder cuentaPorCobrar(CuentaPorCobrarDominio cuentaPorCobrar) {
			this.cuentaPorCobrar = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(cuentaPorCobrar,
					new CuentaPorCobrarDominio.Builder().build());
			return this;
		}

		public Builder sede(SedeDominio sede) {
			this.sede = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(sede, new SedeDominio.Builder().build());
			return this;
		}

		public Builder tipoEstadoPago(TipoEstadoPagoDominio tipoEstadoPago) {
			this.tipoEstadoPago = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(tipoEstadoPago,
					new TipoEstadoPagoDominio.Builder().build());
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

		public Builder plazoDia(int plazoDia) {
			this.plazoDia = plazoDia;
			return this;

		}

		public Builder fechaLimitePago(LocalDateTime fechaLimitePago) {
			this.fechaLimitePago = UtilFecha.obtenerValorDefecto(fechaLimitePago);
			return this;

		}

		public Builder codigoVenta(String codigoVenta) {
			this.codigoVenta = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(codigoVenta);
			return this;
		}

		public Builder confirmada(boolean confirmada) {
			this.confirmada = confirmada;
			return this;

		}

		public Builder anulada(boolean anulada) {
			this.anulada = anulada;
			return this;

		}

		public Builder fechaAnulacion(LocalDateTime fechaAnulacion) {
			this.fechaAnulacion = UtilFecha.obtenerValorDefecto(fechaAnulacion);
			return this;

		}
		
		public VentaDominio build() {
			return new VentaDominio(this);
		}

	}

}
