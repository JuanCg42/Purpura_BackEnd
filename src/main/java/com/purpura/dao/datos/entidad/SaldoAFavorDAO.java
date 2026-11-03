package com.purpura.dao.datos.entidad;

import java.util.UUID;

import com.purpura.dao.datos.ActualizarDAO;
import com.purpura.dao.datos.ConsultarDAO;
import com.purpura.dao.datos.CrearDAO;
import com.purpura.entidad.SaldoAFavorEntidad;

public interface SaldoAFavorDAO
		extends CrearDAO<SaldoAFavorEntidad>, ConsultarDAO<SaldoAFavorEntidad, UUID>,ActualizarDAO<SaldoAFavorEntidad, UUID> {

}
