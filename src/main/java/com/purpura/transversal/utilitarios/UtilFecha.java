package com.purpura.transversal.utilitarios;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class UtilFecha {

	public static final ZoneId ZONA_COLOMBIA = ZoneId.of("America/Bogota");
	public static final LocalDateTime FECHA_HORA_DEFECTO = LocalDateTime.of(1900, 1, 1, 0, 0);
	public static final DateTimeFormatter FORMATO_FECHA_HORA = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

	private UtilFecha() {

	}

	public static LocalDateTime obtenerFechaHoraActual() {

		return LocalDateTime.now(ZONA_COLOMBIA).truncatedTo(ChronoUnit.MINUTES);
	}

	public static LocalDateTime obtenerValorDefecto(LocalDateTime fechaHora) {

		return UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(fechaHora, FECHA_HORA_DEFECTO);
	}

	public static String formatoFechaHora(LocalDateTime fechaHora) {

		return obtenerValorDefecto(fechaHora).format(FORMATO_FECHA_HORA);

	}
	
	public static boolean esFechaHoraDefecto(LocalDateTime fechaHora) {
	    return FECHA_HORA_DEFECTO.equals(obtenerValorDefecto(fechaHora));
	}
	

	

}
