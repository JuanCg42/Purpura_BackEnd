package com.purpura.dominio;

import java.util.UUID;
import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class ProductoSedeDominio {
	private SedeDominio sede;
	private ProductoDominio producto;
	private UUID id;
	private int stock;

	private ProductoSedeDominio(Builder builder) {
		this.sede = builder.sede;
		this.producto = builder.producto;
		this.stock = builder.stock;
		this.id = builder.id;

	}

	public SedeDominio getSede() {
		return sede;
	}

	public ProductoDominio getProducto() {
		return producto;
	}

	public UUID getId() {
		return id;
	}

	public int getStock() {
		return stock;
	}

	public static class Builder {
		private SedeDominio sede;
		private ProductoDominio producto;
		private int stock;
		private UUID id;

		public Builder() {
			sede = new SedeDominio.Builder().build();
			producto = new ProductoDominio.Builder().build();
			id = UtilUUID.obtenerUUIDDefecto();
			stock = UtilNumero.CERO;

		}

		public Builder sede(SedeDominio sede) {
			this.sede = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(sede, new SedeDominio.Builder().build());
			return this;
		}

		public Builder producto(ProductoDominio producto) {
			this.producto = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(producto,
					new ProductoDominio.Builder().build());
			return this;
		}

		public Builder id(UUID id) {
			this.id = UtilUUID.obtenerValorDefecto(id);
			return this;
		}

		public Builder stock(int stock) {
			this.stock = stock;
			return this;
		}

		public ProductoSedeDominio build() {
			return new ProductoSedeDominio(this);
		}

	}

}
