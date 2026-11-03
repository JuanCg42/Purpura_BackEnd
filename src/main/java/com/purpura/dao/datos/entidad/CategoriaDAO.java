package com.purpura.dao.datos.entidad;

import java.util.UUID;

import com.purpura.dao.datos.ActualizarDAO;
import com.purpura.dao.datos.ConsultarDAO;
import com.purpura.dao.datos.CrearDAO;
import com.purpura.dao.datos.EliminarDAO;
import com.purpura.entidad.CategoriaEntidad;


public interface CategoriaDAO extends CrearDAO<CategoriaEntidad>, ActualizarDAO<CategoriaEntidad, UUID>,
		ConsultarDAO<CategoriaEntidad, UUID>, EliminarDAO<UUID> {

}
