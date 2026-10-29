package com.purpura.entidad;

import java.util.UUID;

import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class CuentaPorCobrarEntidad {
	private ClienteEntidad cliente;
	private UUID id;
	private String codigoCartera;
	private int total;
	private int pendiente;
	private int cupoMaximo;
	private int cupoDisponible;

	public CuentaPorCobrarEntidad() {
		setCliente(new ClienteEntidad());
		setId(UtilUUID.obtenerUUIDDefecto());
		setCodigoCartera(UtilTexto.VACIA);
		setTotal(UtilNumero.CERO);
		setPendiente(UtilNumero.CERO);
		setCupoMaximo(UtilNumero.CERO);
		setCupoDisponible(UtilNumero.CERO);

	}

	public ClienteEntidad getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntidad cliente) {
		this.cliente = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(cliente, new ClienteEntidad());
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = UtilUUID.obtenerValorDefecto(id);
	}

	public String getCodigoCartera() {
		return codigoCartera;
	}

	public void setCodigoCartera(String codigoCartera) {
		this.codigoCartera = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(codigoCartera);
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPendiente() {
		return pendiente;
	}

	public void setPendiente(int pendiente) {
		this.pendiente = pendiente;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}

	public void setCupoMaximo(int cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}

	public int getCupoDisponible() {
		return cupoDisponible;
	}

	public void setCupoDisponible(int cupoDisponible) {
		this.cupoDisponible = cupoDisponible;
	}

}
