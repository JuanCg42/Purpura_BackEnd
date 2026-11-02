package com.purpura.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.web.bind.annotation.BindParam;

import com.purpura.transversal.utilitarios.UtilFecha;
import com.purpura.transversal.utilitarios.UtilNumero;
import com.purpura.transversal.utilitarios.UtilObjeto;
import com.purpura.transversal.utilitarios.UtilTexto;
import com.purpura.transversal.utilitarios.UtilUUID;

public class AjusteCupoDTO {
	@BindParam("cuentaPorCobrar")
	private CuentaPorCobrarDTO cuentaPorCobrar;

	@BindParam("id")
	private UUID id;

	@BindParam("fechaHora")
	private LocalDateTime fechaHora;

	@BindParam("cupoAnterior")
	private int cupoAnterior;

	@BindParam("cupoNuevo")
	private int cupoNuevo;

	@BindParam("diasMoraAcumulados")
	private int diasMoraAcumulados;

	@BindParam("motivo")
	private String motivo;

	public AjusteCupoDTO() {
		setCuentaPorCobrar(new CuentaPorCobrarDTO());
		setId(UtilUUID.obtenerUUIDDefecto());
		setFechaHora(UtilFecha.FECHA_HORA_DEFECTO);
		setCupoAnterior(UtilNumero.CERO);
		setCupoNuevo(UtilNumero.CERO);
		setDiasMoraAcumulados(UtilNumero.CERO);
		setMotivo(UtilTexto.VACIA);

	}

	public CuentaPorCobrarDTO getCuentaPorCobrar() {
		return cuentaPorCobrar;
	}

	public void setCuentaPorCobrar(CuentaPorCobrarDTO cuentaPorCobrar) {
		this.cuentaPorCobrar = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(cuentaPorCobrar,
				new CuentaPorCobrarDTO());
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = UtilUUID.obtenerValorDefecto(id);
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = UtilFecha.obtenerValorDefecto(fechaHora);
	}

	public int getCupoAnterior() {
		return cupoAnterior;
	}

	public void setCupoAnterior(int cupoAnterior) {
		this.cupoAnterior = cupoAnterior;
	}

	public int getCupoNuevo() {
		return cupoNuevo;
	}

	public void setCupoNuevo(int cupoNuevo) {
		this.cupoNuevo = cupoNuevo;
	}

	public int getDiasMoraAcumulados() {
		return diasMoraAcumulados;
	}

	public void setDiasMoraAcumulados(int diasMoraAcumulados) {
		this.diasMoraAcumulados = diasMoraAcumulados;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(motivo);
	}

}
