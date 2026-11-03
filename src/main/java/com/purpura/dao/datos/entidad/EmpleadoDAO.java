package com.purpura.dao.datos.entidad;

import java.util.UUID;

import com.purpura.dao.datos.ActualizarDAO;
import com.purpura.dao.datos.ConsultarDAO;
import com.purpura.dao.datos.CrearDAO;
import com.purpura.entidad.EmpleadoEntidad;

public interface EmpleadoDAO extends  CrearDAO<EmpleadoEntidad>, ActualizarDAO<EmpleadoEntidad, UUID>,
ConsultarDAO<EmpleadoEntidad, UUID>{

}
