package com.purpura.entidad;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class ProductoSedeEntidad {
	private ProductoEntidad producto;
	private SedeEntidad sede;
	private UUID id;
	private int stock;
	
	public ProductoSedeEntidad(){
		setProducto(new ProductoEntidad());
		setSede(new SedeEntidad());
		setId(UtilUUID.obtenerUUIDDefecto());
		setStock(UtilNumero.CERO);
		
	}

	public ProductoEntidad getProducto() {
		return producto;
	}

	public void setProducto(ProductoEntidad producto) {
		this.producto = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(producto, new ProductoEntidad());
	}

	public SedeEntidad getSede() {
		return sede;
	}

	public void setSede(SedeEntidad sede) {
		this.sede = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(sede, new SedeEntidad());
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = UtilUUID.obtenerValorDefecto(id);
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
