package com.purpura.dominio;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class ProductoDominio {
	private ProductoBaseDominio productoBase;
	private TallaDominio talla;
	private UUID id;

	private ProductoDominio(Builder builder) {
		this.productoBase = builder.productoBase;
		this.talla = builder.talla;
		this.id = builder.id;

	}

	public ProductoBaseDominio getProductoBase() {
		return productoBase;
	}

	public TallaDominio getTalla() {
		return talla;
	}

	public UUID getId() {
		return id;
	}

	public static class Builder {
		private ProductoBaseDominio productoBase;
		private TallaDominio talla;
		private UUID id;

		public Builder() {
			productoBase = new ProductoBaseDominio.Builder().build();
			talla = new TallaDominio.Builder().build();
			id = UtilUUID.obtenerUUIDDefecto();

		}

		public Builder productoBase(ProductoBaseDominio productoBase) {
			this.productoBase = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(productoBase,
					new ProductoBaseDominio.Builder().build());
			return this;
		}

		public Builder talla(TallaDominio talla) {
			this.talla = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(talla, new TallaDominio.Builder().build());
			return this;
		}

		public Builder id(UUID id) {
			this.id = UtilUUID.obtenerValorDefecto(id);
			return this;
		}

		public ProductoDominio build() {
			return new ProductoDominio(this);
		}
	}

}
