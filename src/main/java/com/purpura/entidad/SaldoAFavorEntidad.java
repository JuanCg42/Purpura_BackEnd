package com.purpura.entidad;

import java.time.LocalDateTime;
import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilFecha;
import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class SaldoAFavorEntidad {
	private ClienteEntidad cliente;
	private VentaEntidad venta;
	private UUID id;
	private int monto;
	private LocalDateTime fechaHora;
	private boolean disponible;
	private LocalDateTime fechaConsumo;

	public SaldoAFavorEntidad() {
		setCliente(new ClienteEntidad());
		setVenta(new VentaEntidad());
		setId(UtilUUID.obtenerUUIDDefecto());
		setMonto(UtilNumero.CERO);
		setFechaHora(UtilFecha.FECHA_HORA_DEFECTO);
		setDisponible(true);
		setFechaConsumo(UtilFecha.FECHA_HORA_DEFECTO);
	}

	public ClienteEntidad getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntidad cliente) {
		this.cliente = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(cliente, new ClienteEntidad());
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
