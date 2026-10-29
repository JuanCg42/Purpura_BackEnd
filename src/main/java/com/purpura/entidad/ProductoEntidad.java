package com.purpura.entidad;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class ProductoEntidad {
	private ProductoBaseEntidad productoBase;
	private UUID id;
	private TallaEntidad talla;

	public ProductoEntidad() {

		setId(UtilUUID.obtenerUUIDDefecto());
		setProductoBase(new ProductoBaseEntidad());
		setTalla(new TallaEntidad());

	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = UtilUUID.obtenerValorDefecto(id);
	}

	public ProductoBaseEntidad getProductoBase() {
		return productoBase;
	}

	public void setProductoBase(ProductoBaseEntidad productoBase) {
		this.productoBase = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(productoBase, new ProductoBaseEntidad());
	}

	public TallaEntidad getTalla() {
		return talla;
	}

	public void setTalla(TallaEntidad talla) {
		this.talla = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(talla, new TallaEntidad());
	}

}
