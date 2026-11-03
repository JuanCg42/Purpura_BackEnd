package com.purpura.dao.datos.entidad;

import java.util.UUID;

import com.purpura.dao.datos.ActualizarDAO;
import com.purpura.dao.datos.ConsultarDAO;
import com.purpura.dao.datos.CrearDAO;
import com.purpura.entidad.PersonaEntidad;

public interface PersonaDAO extends  CrearDAO<PersonaEntidad>, ActualizarDAO<PersonaEntidad, UUID>,
ConsultarDAO<PersonaEntidad, UUID>{

}
