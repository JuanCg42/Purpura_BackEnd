package com.purpura.dao.datos.entidad;

import java.util.UUID;

import com.purpura.dao.datos.ActualizarDAO;
import com.purpura.dao.datos.ConsultarDAO;
import com.purpura.dao.datos.CrearDAO;
import com.purpura.entidad.DireccionEntidad;

public interface DireccionDAO extends CrearDAO<DireccionEntidad>, ActualizarDAO<DireccionEntidad, UUID>,
		ConsultarDAO<DireccionEntidad, UUID> {

}
