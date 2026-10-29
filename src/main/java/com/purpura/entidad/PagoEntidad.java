package com.purpura.entidad;

import java.time.LocalDateTime;
import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilFecha;
import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class PagoEntidad {
	private CuentaPorCobrarEntidad cuentaPorCobrar;
	private FormaPagoEntidad formaPago;
	private UUID id;
	private LocalDateTime fechaHora;
	private int abono;

	public PagoEntidad() {
		setCuentaPorCobrar(new CuentaPorCobrarEntidad());
		setFormaPago(new FormaPagoEntidad());
		setId(UtilUUID.obtenerUUIDDefecto());
		setFechaHora(UtilFecha.FECHA_HORA_DEFECTO);
		setAbono(UtilNumero.CERO);
	}

	public CuentaPorCobrarEntidad getCuentaPorCobrar() {
		return cuentaPorCobrar;
	}

	public void setCuentaPorCobrar(CuentaPorCobrarEntidad cuentaPorCobrar) {
		this.cuentaPorCobrar = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(cuentaPorCobrar,
				new CuentaPorCobrarEntidad());
	}

	public FormaPagoEntidad getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(FormaPagoEntidad formaPago) {
		this.formaPago = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(formaPago, new FormaPagoEntidad());
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

	public int getAbono() {
		return abono;
	}

	public void setAbono(int abono) {
		this.abono = abono;
	}

}
