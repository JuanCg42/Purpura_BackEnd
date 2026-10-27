package com.purpura.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilFecha;
import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class SaldoAFavorDTO {
	private ClienteDTO cliente;
	private VentaDTO venta;
	private UUID id;
	private int monto;
	private LocalDateTime fechaHora;
	private boolean disponible;
	private LocalDateTime fechaConsumo;

	public SaldoAFavorDTO() {
		setCliente(new ClienteDTO());
		setVenta(new VentaDTO());
		setId(UtilUUID.obtenerUUIDDefecto());
		setMonto(UtilNumero.CERO);
		setFechaHora(UtilFecha.FECHA_HORA_DEFECTO);
		setDisponible(true);
		setFechaConsumo(UtilFecha.FECHA_HORA_DEFECTO);
	}

	public ClienteDTO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDTO cliente) {
		this.cliente = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(cliente, new ClienteDTO());
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

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = UtilFecha.obtenerValorDefecto(fechaHora);
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public LocalDateTime getFechaConsumo() {
		return fechaConsumo;
	}

	public void setFechaConsumo(LocalDateTime fechaConsumo) {
		this.fechaConsumo = UtilFecha.obtenerValorDefecto(fechaConsumo);
	}

}
