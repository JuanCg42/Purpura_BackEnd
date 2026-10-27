package com.purpura.dto;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class PagoVentaDTO {
	private FormaPagoDTO formaPago;
	private VentaDTO venta;
	private UUID id;
	private int monto;
	
	public PagoVentaDTO() {
		setFormaPago(new FormaPagoDTO());
		setVenta(new VentaDTO());
		setId(UtilUUID.obtenerUUIDDefecto());
		setMonto(UtilNumero.CERO);
		
	}

	public FormaPagoDTO getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(FormaPagoDTO formaPago) {
		this.formaPago = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(formaPago,new FormaPagoDTO());
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

}
