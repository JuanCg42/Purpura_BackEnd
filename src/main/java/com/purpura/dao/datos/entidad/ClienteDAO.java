package com.purpura.dao.datos.entidad;

import java.util.UUID;

import com.purpura.dao.datos.ConsultarDAO;
import com.purpura.dao.datos.CrearDAO;
import com.purpura.entidad.ClienteEntidad;

public interface ClienteDAO extends CrearDAO<ClienteEntidad>, ConsultarDAO<ClienteEntidad, UUID> {

}
