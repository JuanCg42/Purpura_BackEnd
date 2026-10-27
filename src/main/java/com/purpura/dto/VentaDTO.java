package com.purpura.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilFecha;
import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class VentaDTO {
	private CuentaPorCobrarDTO cuentaPorCobrar;
	private SedeDTO sede;
	private TipoEstadoPagoDTO tipoEstadoPago;
	private EmpleadoDTO empleado;
	private UUID id;
	private LocalDateTime fechaHora;
	private int plazoDia;
	private LocalDateTime fechaLimitePago;
	private String codigoVenta;
	private boolean confirmada;
	private boolean anulada;
	private LocalDateTime fechaAnulacion;

	public VentaDTO() {
		setCuentaPorCobrar(new CuentaPorCobrarDTO());
		setSede(new SedeDTO());
		setTipoEstadoPago(new TipoEstadoPagoDTO());
		setEmpleado(new EmpleadoDTO());
		setId(UtilUUID.obtenerUUIDDefecto());
		setFechaHora(UtilFecha.FECHA_HORA_DEFECTO);
		setPlazoDia(UtilNumero.CERO);
		setFechaLimitePago(UtilFecha.FECHA_HORA_DEFECTO);
		setCodigoVenta(UtilTexto.VACIA);
		setConfirmada(false);
		setAnulada(false);
		setFechaAnulacion(UtilFecha.FECHA_HORA_DEFECTO);

	}

	public CuentaPorCobrarDTO getCuentaPorCobrar() {
		return cuentaPorCobrar;
	}

	public void setCuentaPorCobrar(CuentaPorCobrarDTO cuentaPorCobrar) {
		this.cuentaPorCobrar = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(cuentaPorCobrar,
				new CuentaPorCobrarDTO());
	}

	public SedeDTO getSede() {
		return sede;
	}

	public void setSede(SedeDTO sede) {
		this.sede = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(sede, new SedeDTO());
	}

	public TipoEstadoPagoDTO getTipoEstadoPago() {
		return tipoEstadoPago;
	}

	public void setTipoEstadoPago(TipoEstadoPagoDTO tipoEstadoPago) {
		this.tipoEstadoPago = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(tipoEstadoPago,
				new TipoEstadoPagoDTO());
	}

	public EmpleadoDTO getEmpleado() {
		return empleado;
	}

	public void setEmpleado(EmpleadoDTO empleado) {
		this.empleado = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(empleado, new EmpleadoDTO());
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
