package com.purpura.transversal.utilitarios;

public class UtilNumero {

	public static final int CERO = 0;

	private UtilNumero() {

	}

	public static <N extends Number> Number obtenerValorDefecto(N valor) {
		return UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(valor, CERO);
	}

	public static <N extends Number> boolean mayorQue(N numeroUno, N numeroDos) {

		return obtenerValorDefecto(numeroUno).doubleValue() > obtenerValorDefecto(numeroDos).doubleValue();
	}

	public static <N extends Number> boolean menorQue(N numeroUno, N numeroDos) {

		return obtenerValorDefecto(numeroUno).doubleValue() < obtenerValorDefecto(numeroDos).doubleValue();
	}

	public static <N extends Number> boolean esNegativo(N valor) {
		return menorQue(valor, CERO);
	}

}
