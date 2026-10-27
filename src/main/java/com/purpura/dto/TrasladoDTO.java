package com.purpura.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilFecha;
import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class TrasladoDTO {
	private SedeDTO sede;
	private EmpleadoDTO empleado;
	private ProductoSedeDTO productoSede;
	private UUID id;
	private int cantidad;
	private LocalDateTime fechaHora;
	
	public TrasladoDTO() {
		setSede(new SedeDTO());
		setEmpleado(new EmpleadoDTO());
		setProductoSede(new ProductoSedeDTO());
		setId(UtilUUID.obtenerUUIDDefecto());
		setCantidad(UtilNumero.CERO);
		setFechaHora(UtilFecha.FECHA_HORA_DEFECTO);
	}

	public SedeDTO getSede() {
		return sede;
	}

	public void setSede(SedeDTO sede) {
		this.sede = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(sede, new SedeDTO());
	}

	public EmpleadoDTO getEmpleado() {
		return empleado;
	}

	public void setEmpleado(EmpleadoDTO empleado) {
		this.empleado = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(empleado, new EmpleadoDTO());
	}

	public ProductoSedeDTO getProductoSede() {
		return productoSede;
	}

	public void setProductoSede(ProductoSedeDTO productoSede) {
		this.productoSede = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(productoSede, new ProductoSedeDTO());
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

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = UtilFecha.obtenerValorDefecto(fechaHora);
	}

}
