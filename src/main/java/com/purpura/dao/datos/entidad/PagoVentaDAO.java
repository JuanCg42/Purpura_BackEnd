package com.purpura.dao.datos.entidad;

import java.util.UUID;

import com.purpura.dao.datos.ConsultarDAO;
import com.purpura.dao.datos.CrearDAO;
import com.purpura.dao.datos.EliminarDAO;
import com.purpura.entidad.PagoVentaEntidad;

public interface PagoVentaDAO
		extends CrearDAO<PagoVentaEntidad>, ConsultarDAO<PagoVentaEntidad, UUID>, EliminarDAO<UUID> {

}
