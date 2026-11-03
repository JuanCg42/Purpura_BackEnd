package com.purpura.dao.datos.entidad;

import java.util.UUID;

import com.purpura.dao.datos.ActualizarDAO;
import com.purpura.dao.datos.ConsultarDAO;
import com.purpura.dao.datos.CrearDAO;
import com.purpura.dao.datos.EliminarDAO;
import com.purpura.entidad.ProductoVentaEntidad;

public interface ProductoVentaDAO extends  CrearDAO<ProductoVentaEntidad>, ActualizarDAO<ProductoVentaEntidad, UUID>,
ConsultarDAO<ProductoVentaEntidad, UUID>, EliminarDAO<UUID>{

}
