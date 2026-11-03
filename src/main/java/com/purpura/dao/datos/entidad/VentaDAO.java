package com.purpura.dao.datos.entidad;

import java.util.UUID;

import com.purpura.dao.datos.ActualizarDAO;
import com.purpura.dao.datos.ConsultarDAO;
import com.purpura.dao.datos.CrearDAO;
import com.purpura.dao.datos.EliminarDAO;
import com.purpura.entidad.VentaEntidad;

public interface VentaDAO extends  CrearDAO<VentaEntidad>, ActualizarDAO<VentaEntidad, UUID>,
ConsultarDAO<VentaEntidad, UUID>, EliminarDAO<UUID> {

}
