package com.purpura.dto;

import java.util.UUID;

import org.springframework.web.bind.annotation.BindParam;

import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class ProductoBaseDTO {
	@BindParam("tallaje")
	private TallajeDTO tallaje;

	@BindParam("categoria")
	private CategoriaDTO categoria;

	@BindParam("proveedor")
	private ProveedorDTO proveedor;

	@BindParam("id")
	private UUID id;

	@BindParam("codigoBarras")
	private String codigoBarras;

	@BindParam("nombre")
	private String nombre;

	@BindParam("costo")
	private int costo;

	@BindParam("precioVenta")
	private int precioVenta;

	public ProductoBaseDTO() {
		setTallaje(new TallajeDTO());
		setCategoria(new CategoriaDTO());
		setProveedor(new ProveedorDTO());
		setId(UtilUUID.obtenerUUIDDefecto());
		setCodigoBarras(UtilTexto.VACIA);
		setNombre(UtilTexto.VACIA);
		setCosto(UtilNumero.CERO);
		setPrecioVenta(UtilNumero.CERO);

	}

	public TallajeDTO getTallaje() {
		return tallaje;
	}

	public void setTallaje(TallajeDTO tallaje) {
		this.tallaje = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(tallaje, new TallajeDTO());
	}

	public CategoriaDTO getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaDTO categoria) {
		this.categoria = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(categoria, new CategoriaDTO());
	}

	public ProveedorDTO getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedorDTO proveedor) {
		this.proveedor = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(proveedor, new ProveedorDTO());
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
