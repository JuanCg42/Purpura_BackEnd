package com.purpura.dto;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class PagoVentaDTO {
	private FormaPagoDTO formaPago;
	private VentaDTO codigoVenta;
	private UUID id;
	private int monto;
	
	public PagoVentaDTO() {
		setFormaPago(new FormaPagoDTO());
		setCodigoVenta(new VentaDTO());
		setId(UtilUUID.obtenerUUIDDefecto());
		setMonto(UtilNumero.CERO);
		
	}

	public FormaPagoDTO getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(FormaPagoDTO formaPago) {
		this.formaPago = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(formaPago,new FormaPagoDTO());
	}

	public VentaDTO getCodigoVenta() {
		return codigoVenta;
	}

	public void setCodigoVenta(VentaDTO codigoVenta) {
		this.codigoVenta = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(codigoVenta, new VentaDTO());
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

}
