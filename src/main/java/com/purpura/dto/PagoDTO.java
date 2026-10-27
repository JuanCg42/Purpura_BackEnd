package com.purpura.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilFecha;
import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class PagoDTO {
	private CuentaPorCobrarDTO cuentaPorCobrar;
	private FormaPagoDTO formaPago;
	private UUID id;
	private LocalDateTime fechaHora;
	private int abono;

	public PagoDTO() {
		setCuentaPorCobrar(new CuentaPorCobrarDTO());
		setFormaPago(new FormaPagoDTO());
		setId(UtilUUID.obtenerUUIDDefecto());
		setFechaHora(UtilFecha.FECHA_HORA_DEFECTO);
		setAbono(UtilNumero.CERO);
	}

	public CuentaPorCobrarDTO getCuentaPorCobrar() {
		return cuentaPorCobrar;
	}

	public void setCuentaPorCobrar(CuentaPorCobrarDTO cuentaPorCobrar) {
		this.cuentaPorCobrar = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(cuentaPorCobrar,
				new CuentaPorCobrarDTO());
	}

	public FormaPagoDTO getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(FormaPagoDTO formaPago) {
		this.formaPago = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(formaPago, new FormaPagoDTO());
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
