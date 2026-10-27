package com.purpura.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilFecha;
import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class MovimientoInventarioDTO {
	private ProductoSedeDTO productoSede;
	private TipoMovimientoDTO tipoMovimiento;
	private UUID id;
	private int cantidad;
	private String observacion;
	private LocalDateTime fechaHora;
	
	public MovimientoInventarioDTO() {
		setProductoSede(new ProductoSedeDTO());
		setTipoMovimiento(new TipoMovimientoDTO());
		setId(UtilUUID.obtenerUUIDDefecto());
		setCantidad(UtilNumero.CERO);
		setObservacion(UtilTexto.VACIA);
		setFechaHora(UtilFecha.FECHA_HORA_DEFECTO);
		
		
	}

	public ProductoSedeDTO getProductoSede() {
		return productoSede;
	}

	public void setProductoSede(ProductoSedeDTO productoSede) {
		this.productoSede = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(productoSede, new ProductoSedeDTO());
	}

	public TipoMovimientoDTO getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(TipoMovimientoDTO tipoMovimiento) {
		this.tipoMovimiento = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(tipoMovimiento, new TipoMovimientoDTO());
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = UtilUUID.obtenerValorDefecto(id);
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(observacion);
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = UtilFecha.obtenerValorDefecto(fechaHora);
	}

}
