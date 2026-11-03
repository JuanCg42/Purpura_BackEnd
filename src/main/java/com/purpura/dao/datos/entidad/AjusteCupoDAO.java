package com.purpura.dao.datos.entidad;

import java.util.UUID;

import com.purpura.dao.datos.ConsultarDAO;
import com.purpura.dao.datos.CrearDAO;
import com.purpura.entidad.AjusteCupoEntidad;

public interface AjusteCupoDAO extends CrearDAO<AjusteCupoEntidad>, ConsultarDAO<AjusteCupoEntidad, UUID> {

}
