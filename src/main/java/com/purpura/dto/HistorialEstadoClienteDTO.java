package com.purpura.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilFecha;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class HistorialEstadoClienteDTO {
	private ClienteDTO cliente;
	private TipoEstadoPagoDTO tipoEstadoPago;
	private VentaDTO venta;
	private UUID id;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	
	public HistorialEstadoClienteDTO() {
		setCliente(new ClienteDTO());
		setTipoEstadoPago(new TipoEstadoPagoDTO());
		setVenta(new VentaDTO());
		setId(UtilUUID.obtenerUUIDDefecto());
		setFechaFin(UtilFecha.FECHA_HORA_DEFECTO);
		setFechaInicio(UtilFecha.FECHA_HORA_DEFECTO);
	}

	public ClienteDTO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDTO cliente) {
		this.cliente = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(cliente, new ClienteDTO());
	}

	public TipoEstadoPagoDTO getTipoEstadoPago() {
		return tipoEstadoPago;
	}

	public void setTipoEstadoPago(TipoEstadoPagoDTO tipoEstadoPago) {
		this.tipoEstadoPago = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(tipoEstadoPago,new  TipoEstadoPagoDTO());
	}

	public VentaDTO getVenta() {
		return venta;
	}

	public void setVenta(VentaDTO venta) {
		this.venta = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(venta, new VentaDTO());
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
