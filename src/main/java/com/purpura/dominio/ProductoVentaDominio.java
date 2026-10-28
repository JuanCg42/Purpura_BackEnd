package com.purpura.dominio;


import java.util.UUID;
import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class ProductoVentaDominio {
	private VentaDominio codigoVenta;
	private ProductoDominio producto;
	private UUID id;
	private int precioVenta;
	private int cantidad;
	private int subTotal;

	private ProductoVentaDominio(Builder builder) {
		this.codigoVenta = builder.codigoVenta;
		this.producto = builder.producto;
		this.precioVenta = builder.precioVenta;
		this.cantidad = builder.cantidad;
		this.subTotal = builder.subTotal;
		this.id = builder.id;

	}

	public VentaDominio getCodigoVenta() {
		return codigoVenta;
	}

	public ProductoDominio getProducto() {
		return producto;
	}

	public UUID getId() {
		return id;
	}

	public int getPrecioVenta() {
		return precioVenta;
	}

	public int getCantidad() {
		return cantidad;
	}

	public int getSubTotal() {
		return subTotal;
	}

	public static class Builder {
		private VentaDominio codigoVenta;
		private ProductoDominio producto;
		private int precioVenta;
		private int cantidad;
		private int subTotal;
		private UUID id;

		public Builder() {
			codigoVenta = new VentaDominio.Builder().build();
			producto = new ProductoDominio.Builder().build();
			id = UtilUUID.obtenerUUIDDefecto();
			precioVenta = UtilNumero.CERO;
			cantidad = UtilNumero.CERO;
			subTotal = UtilNumero.CERO;

		}

		public Builder codigoVenta(VentaDominio codigoVenta) {
			this.codigoVenta = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(codigoVenta,
					new VentaDominio.Builder().build());
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

		public Builder precioVenta(int precioVenta) {
			this.precioVenta = precioVenta;
			return this;
		}

		public Builder cantidad(int cantidad) {
			this.cantidad = cantidad;
			return this;
		}

		public Builder subTotal(int subTotal) {
			this.subTotal = subTotal;
			return this;
		}

		public ProductoVentaDominio build() {
			return new ProductoVentaDominio(this);
		}

	}

}
