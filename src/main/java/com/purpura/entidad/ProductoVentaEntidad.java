package com.purpura.entidad;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class ProductoVentaEntidad {
	private ProductoEntidad producto;
	private VentaEntidad codigoVenta;
	private UUID id;
	private int precioVenta;
	private int cantidad;
	private int subTotal;
	
	
	public ProductoVentaEntidad() {
		setProducto(new ProductoEntidad());
		setVenta(new VentaEntidad());
		setId(UtilUUID.obtenerUUIDDefecto());
		setPrecioVenta(UtilNumero.CERO);
		setCantidad(UtilNumero.CERO);
		setSubTotal(UtilNumero.CERO);
	}

	public ProductoEntidad getProducto() {
		return producto;
	}

	public void setProducto(ProductoEntidad producto) {
		this.producto = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(producto, new ProductoEntidad());
	}

	public VentaEntidad getCodigoVenta() {
		return codigoVenta;
	}

	public void setVenta(VentaEntidad codigoVenta) {
		this.codigoVenta = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(codigoVenta, new VentaEntidad());
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = UtilUUID.obtenerValorDefecto(id);
	}

	public int getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(int subTotal) {
		this.subTotal = subTotal;
	}

}
