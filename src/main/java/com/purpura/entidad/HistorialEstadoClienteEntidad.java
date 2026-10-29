package com.purpura.entidad;

import java.time.LocalDateTime;
import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilFecha;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class HistorialEstadoClienteEntidad {
	private ClienteEntidad cliente;
	private TipoEstadoPagoEntidad tipoEstadoPago;
	private VentaEntidad venta;
	private UUID id;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	
	public HistorialEstadoClienteEntidad() {
		setCliente(new ClienteEntidad());
		setTipoEstadoPago(new TipoEstadoPagoEntidad());
		setVenta(new VentaEntidad());
		setId(UtilUUID.obtenerUUIDDefecto());
		setFechaFin(UtilFecha.FECHA_HORA_DEFECTO);
		setFechaInicio(UtilFecha.FECHA_HORA_DEFECTO);
	}

	public ClienteEntidad getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntidad cliente) {
		this.cliente = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(cliente, new ClienteEntidad());
	}

	public TipoEstadoPagoEntidad getTipoEstadoPago() {
		return tipoEstadoPago;
	}

	public void setTipoEstadoPago(TipoEstadoPagoEntidad tipoEstadoPago) {
		this.tipoEstadoPago = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(tipoEstadoPago,new  TipoEstadoPagoEntidad());
	}

	public VentaEntidad getVenta() {
		return venta;
	}

	public void setVenta(VentaEntidad venta) {
		this.venta = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(venta, new VentaEntidad());
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = UtilUUID.obtenerValorDefecto(id);
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = UtilFecha.obtenerValorDefecto(fechaInicio);
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = UtilFecha.obtenerValorDefecto(fechaFin);
	}

}
