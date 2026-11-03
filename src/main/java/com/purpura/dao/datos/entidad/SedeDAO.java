package com.purpura.dao.datos.entidad;

import java.util.UUID;

import com.purpura.dao.datos.ActualizarDAO;
import com.purpura.dao.datos.ConsultarDAO;
import com.purpura.dao.datos.CrearDAO;
import com.purpura.entidad.SedeEntidad;

public interface SedeDAO extends  CrearDAO<SedeEntidad>, ActualizarDAO<SedeEntidad, UUID>,
ConsultarDAO<SedeEntidad, UUID>{

}
