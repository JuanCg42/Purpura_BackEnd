package com.purpura.dominio;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class ProductoBaseDominio {
	private TallajeDominio tallaje;
	private CategoriaDominio categoria;
	private ProveedorDominio proveedor;
	private UUID id;
	private String codigoBarras;
	private String nombre;
	private int costo;
	private int precioVenta;

	private ProductoBaseDominio(Builder builder) {

		this.id = builder.id;
		this.nombre = builder.nombre;
		this.codigoBarras = builder.codigoBarras;
		this.costo = builder.costo;
		this.precioVenta = builder.precioVenta;
		this.categoria = builder.categoria;
		this.tallaje = builder.tallaje;
		this.proveedor = builder.proveedor;

	}

	public TallajeDominio getTallaje() {
		return tallaje;
	}

	public CategoriaDominio getCategoria() {
		return categoria;
	}

	public ProveedorDominio getProveedor() {
		return proveedor;
	}

	public UUID getId() {
		return id;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCosto() {
		return costo;
	}

	public int getPrecioVenta() {
		return precioVenta;
	}

	public static class Builder {

		private TallajeDominio tallaje;
		private CategoriaDominio categoria;
		private ProveedorDominio proveedor;
		private UUID id;
		private String codigoBarras;
		private String nombre;
		private int costo;
		private int precioVenta;

		public Builder() {
			id = UtilUUID.obtenerUUIDDefecto();
			nombre = UtilTexto.VACIA;
			codigoBarras = UtilTexto.VACIA;
			costo = UtilNumero.CERO;
			precioVenta = UtilNumero.CERO;
			tallaje = new TallajeDominio.Builder().build();
			categoria = new CategoriaDominio.Builder().build();
			proveedor = new ProveedorDominio.Builder().build();

		}

		public Builder id(UUID id) {
			this.id = UtilUUID.obtenerValorDefecto(id);
			return this;
		}

		public Builder nombre(String nombre) {
			this.nombre = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(nombre);
			return this;
		}

		public Builder codigoBarras(String codigoBarras) {
			this.codigoBarras = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(codigoBarras);
			return this;
		}

		public Builder costo(int costo) {
			this.costo = costo;
			return this;
		}

		public Builder precioVenta(int precioVenta) {
			this.precioVenta = precioVenta;
			return this;
		}

		public Builder tallaje(TallajeDominio tallaje) {
			this.tallaje = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(tallaje,
					new TallajeDominio.Builder().build());
			return this;
		}

		public Builder categoria(CategoriaDominio categoria) {
			this.categoria = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(categoria,
					new CategoriaDominio.Builder().build());
			return this;
		}

		public Builder proveedor(ProveedorDominio proveedor) {
			this.proveedor = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(proveedor,
					new ProveedorDominio.Builder().build());
			return this;
		}

		public ProductoBaseDominio build() {
			return new ProductoBaseDominio(this);
		}
	}

}
