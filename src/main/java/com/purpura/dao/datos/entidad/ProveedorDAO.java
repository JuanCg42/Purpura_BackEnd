package com.purpura.dao.datos.entidad;

import java.util.UUID;

import com.purpura.dao.datos.ActualizarDAO;
import com.purpura.dao.datos.ConsultarDAO;
import com.purpura.dao.datos.CrearDAO;
import com.purpura.entidad.ProveedorEntidad;

public interface ProveedorDAO extends  CrearDAO<ProveedorEntidad>, ActualizarDAO<ProveedorEntidad, UUID>,
ConsultarDAO<ProveedorEntidad, UUID>{

}
