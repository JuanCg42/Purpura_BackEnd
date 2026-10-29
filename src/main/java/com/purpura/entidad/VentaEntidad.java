package com.purpura.entidad;

import java.time.LocalDateTime;
import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilFecha;
import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class VentaEntidad {
	private CuentaPorCobrarEntidad cuentaPorCobrar;
	private SedeEntidad sede;
	private TipoEstadoPagoEntidad tipoEstadoPago;
	private EmpleadoEntidad empleado;
	private UUID id;
	private LocalDateTime fechaHora;
	private int plazoDia;
	private LocalDateTime fechaLimitePago;
	private String codigoVenta;
	private boolean confirmada;
	private boolean anulada;
	private LocalDateTime fechaAnulacion;

	public VentaEntidad() {
		setCuentaPorCobrar(new CuentaPorCobrarEntidad());
		setSede(new SedeEntidad());
		setTipoEstadoPago(new TipoEstadoPagoEntidad());
		setEmpleado(new EmpleadoEntidad());
		setId(UtilUUID.obtenerUUIDDefecto());
		setFechaHora(UtilFecha.FECHA_HORA_DEFECTO);
		setPlazoDia(UtilNumero.CERO);
		setFechaLimitePago(UtilFecha.FECHA_HORA_DEFECTO);
		setCodigoVenta(UtilTexto.VACIA);
		setConfirmada(false);
		setAnulada(false);
		setFechaAnulacion(UtilFecha.FECHA_HORA_DEFECTO);

	}

	public CuentaPorCobrarEntidad getCuentaPorCobrar() {
		return cuentaPorCobrar;
	}

	public void setCuentaPorCobrar(CuentaPorCobrarEntidad cuentaPorCobrar) {
		this.cuentaPorCobrar = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(cuentaPorCobrar,
				new CuentaPorCobrarEntidad());
	}

	public SedeEntidad getSede() {
		return sede;
	}

	public void setSede(SedeEntidad sede) {
		this.sede = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(sede, new SedeEntidad());
	}

	public TipoEstadoPagoEntidad getTipoEstadoPago() {
		return tipoEstadoPago;
	}

	public void setTipoEstadoPago(TipoEstadoPagoEntidad tipoEstadoPago) {
		this.tipoEstadoPago = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(tipoEstadoPago,
				new TipoEstadoPagoEntidad());
	}

	public EmpleadoEntidad getEmpleado() {
		return empleado;
	}

	public void setEmpleado(EmpleadoEntidad empleado) {
		this.empleado = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(empleado, new EmpleadoEntidad());
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = UtilUUID.obtenerValorDefecto(id);
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = UtilFecha.obtenerValorDefecto(fechaHora);
	}

	public int getPlazoDia() {
		return plazoDia;
	}

	public void setPlazoDia(int plazoDia) {
		this.plazoDia = plazoDia;
	}

	public LocalDateTime getFechaLimitePago() {
		return fechaLimitePago;
	}

	public void setFechaLimitePago(LocalDateTime fechaLimitePago) {
		this.fechaLimitePago = UtilFecha.obtenerValorDefecto(fechaLimitePago);
	}

	public String getCodigoVenta() {
		return codigoVenta;
	}

	public void setCodigoVenta(String codigoVenta) {
		this.codigoVenta = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(codigoVenta);
	}

	public boolean isConfirmada() {
		return confirmada;
	}

	public void setConfirmada(boolean confirmada) {
		this.confirmada = confirmada;
	}

	public boolean isAnulada() {
		return anulada;
	}

	public void setAnulada(boolean anulada) {
		this.anulada = anulada;
	}

	public LocalDateTime getFechaAnulacion() {
		return fechaAnulacion;
	}

	public void setFechaAnulacion(LocalDateTime fechaAnulacion) {
		this.fechaAnulacion = UtilFecha.obtenerValorDefecto(fechaAnulacion);
	}

}
