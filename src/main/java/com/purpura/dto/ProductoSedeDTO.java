package com.purpura.dto;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class ProductoSedeDTO {
	private ProductoDTO producto;
	private SedeDTO sede;
	private UUID id;
	private int stock;
	
	public ProductoSedeDTO(){
		setProducto(new ProductoDTO());
		setSede(new SedeDTO());
		setId(UtilUUID.obtenerUUIDDefecto());
		setStock(UtilNumero.CERO);
		
	}

	public ProductoDTO getProducto() {
		return producto;
	}

	public void setProducto(ProductoDTO producto) {
		this.producto = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(producto, new ProductoDTO());
	}

	public SedeDTO getSede() {
		return sede;
	}

	public void setSede(SedeDTO sede) {
		this.sede = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(sede, new SedeDTO());
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
