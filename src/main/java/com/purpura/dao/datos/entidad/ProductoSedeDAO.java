package com.purpura.dao.datos.entidad;

import java.util.UUID;

import com.purpura.dao.datos.ActualizarDAO;
import com.purpura.dao.datos.ConsultarDAO;
import com.purpura.dao.datos.CrearDAO;
import com.purpura.entidad.ProductoSedeEntidad;

public interface ProductoSedeDAO extends CrearDAO<ProductoSedeEntidad>, ActualizarDAO<ProductoSedeEntidad, UUID>,
		ConsultarDAO<ProductoSedeEntidad, UUID> {

}
