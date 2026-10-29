package com.purpura.entidad;

import java.time.LocalDateTime;
import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilFecha;
import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class TrasladoEntidad {
	private SedeEntidad sede;
	private EmpleadoEntidad empleado;
	private ProductoSedeEntidad productoSede;
	private UUID id;
	private int cantidad;
	private LocalDateTime fechaHora;
	
	public TrasladoEntidad() {
		setSede(new SedeEntidad());
		setEmpleado(new EmpleadoEntidad());
		setProductoSede(new ProductoSedeEntidad());
		setId(UtilUUID.obtenerUUIDDefecto());
		setCantidad(UtilNumero.CERO);
		setFechaHora(UtilFecha.FECHA_HORA_DEFECTO);
	}

	public SedeEntidad getSede() {
		return sede;
	}

	public void setSede(SedeEntidad sede) {
		this.sede = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(sede, new SedeEntidad());
	}

	public EmpleadoEntidad getEmpleado() {
		return empleado;
	}

	public void setEmpleado(EmpleadoEntidad empleado) {
		this.empleado = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(empleado, new EmpleadoEntidad());
	}

	public ProductoSedeEntidad getProductoSede() {
		return productoSede;
	}

	public void setProductoSede(ProductoSedeEntidad productoSede) {
		this.productoSede = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(productoSede, new ProductoSedeEntidad());
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
