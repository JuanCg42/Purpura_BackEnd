package com.purpura.dto;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class ProductoDTO {
	private ProductoBaseDTO productoBase;
	private UUID id;
	private TallaDTO talla;

	public ProductoDTO() {

		setId(UtilUUID.obtenerUUIDDefecto());
		setProductoBase(new ProductoBaseDTO());
		setTalla(new TallaDTO());

	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = UtilUUID.obtenerValorDefecto(id);
	}

	public ProductoBaseDTO getProductoBase() {
		return productoBase;
	}

	public void setProductoBase(ProductoBaseDTO productoBase) {
		this.productoBase = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(productoBase, new ProductoBaseDTO());
	}

	public TallaDTO getTalla() {
		return talla;
	}

	public void setTalla(TallaDTO talla) {
		this.talla = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(talla, new TallaDTO());
	}

}
