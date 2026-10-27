package com.purpura.dto;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class ProductoVentaDTO {
	private ProductoDTO producto;
	private VentaDTO venta;
	private UUID id;
	private int precioVenta;
	private int cantidad;
	private int subTotal;
	
	
	public ProductoVentaDTO() {
		setProducto(new ProductoDTO());
		setVenta(new VentaDTO());
		setId(UtilUUID.obtenerUUIDDefecto());
		setPrecioVenta(UtilNumero.CERO);
		setCantidad(UtilNumero.CERO);
		setSubTotal(UtilNumero.CERO);
	}

	public ProductoDTO getProducto() {
		return producto;
	}

	public void setProducto(ProductoDTO producto) {
		this.producto = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(producto, new ProductoDTO());
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
