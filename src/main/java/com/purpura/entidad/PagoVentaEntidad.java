package com.purpura.entidad;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class PagoVentaEntidad {
	private FormaPagoEntidad formaPago;
	private VentaEntidad codigoVenta;
	private UUID id;
	private int monto;
	
	public PagoVentaEntidad() {
		setFormaPago(new FormaPagoEntidad());
		setCodigoVenta(new VentaEntidad());
		setId(UtilUUID.obtenerUUIDDefecto());
		setMonto(UtilNumero.CERO);
		
	}

	public FormaPagoEntidad getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(FormaPagoEntidad formaPago) {
		this.formaPago = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(formaPago,new FormaPagoEntidad());
	}

	public VentaEntidad getCodigoVenta() {
		return codigoVenta;
	}

	public void setCodigoVenta(VentaEntidad codigoVenta) {
		this.codigoVenta = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(codigoVenta, new VentaEntidad());
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
