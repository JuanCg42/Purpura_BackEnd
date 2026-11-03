package com.purpura.dao.datos.entidad;

import java.util.UUID;

import com.purpura.dao.datos.ActualizarDAO;
import com.purpura.dao.datos.ConsultarDAO;
import com.purpura.dao.datos.CrearDAO;
import com.purpura.entidad.HistorialEstadoClienteEntidad;

public interface HistorialEstadoClienteDAO extends CrearDAO<HistorialEstadoClienteEntidad>,ActualizarDAO<HistorialEstadoClienteEntidad, UUID>,
ConsultarDAO<HistorialEstadoClienteEntidad, UUID>{

}
