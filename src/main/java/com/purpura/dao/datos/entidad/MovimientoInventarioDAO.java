package com.purpura.dao.datos.entidad;

import java.util.UUID;

import com.purpura.dao.datos.ConsultarDAO;
import com.purpura.dao.datos.CrearDAO;
import com.purpura.entidad.MovimientoInventarioEntidad;

public interface MovimientoInventarioDAO
		extends CrearDAO<MovimientoInventarioEntidad>, ConsultarDAO<MovimientoInventarioEntidad, UUID> {

}
