package com.purpura.entidad;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class ProductoBaseEntidad {
	private TallajeEntidad tallaje;
	private CategoriaEntidad categoria;
	private ProveedorEntidad proveedor;
	private UUID id;
	private String codigoBarras;
	private String nombre;
	private int costo;
	private int precioVenta;

	public ProductoBaseEntidad() {
		setTallaje(new TallajeEntidad());
		setCategoria(new CategoriaEntidad());
		setProveedor(new ProveedorEntidad());
		setId(UtilUUID.obtenerUUIDDefecto());
		setCodigoBarras(UtilTexto.VACIA);
		setNombre(UtilTexto.VACIA);
		setCosto(UtilNumero.CERO);
		setPrecioVenta(UtilNumero.CERO);

	}

	public TallajeEntidad getTallaje() {
		return tallaje;
	}

	public void setTallaje(TallajeEntidad tallaje) {
		this.tallaje = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(tallaje, new TallajeEntidad());
	}

	public CategoriaEntidad getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaEntidad categoria) {
		this.categoria = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(categoria, new CategoriaEntidad());
	}

	public ProveedorEntidad getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedorEntidad proveedor) {
		this.proveedor = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(proveedor, new ProveedorEntidad());
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = UtilUUID.obtenerValorDefecto(id);
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(codigoBarras);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(nombre);
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public int getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}

}
