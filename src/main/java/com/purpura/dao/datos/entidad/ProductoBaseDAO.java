package com.purpura.dao.datos.entidad;

import java.util.UUID;

import com.purpura.dao.datos.ActualizarDAO;
import com.purpura.dao.datos.ConsultarDAO;
import com.purpura.dao.datos.CrearDAO;
import com.purpura.entidad.ProductoBaseEntidad;

public interface ProductoBaseDAO extends  CrearDAO<ProductoBaseEntidad>, ActualizarDAO<ProductoBaseEntidad, UUID>,
ConsultarDAO<ProductoBaseEntidad, UUID>{

}
