package com.purpura.dao.datos.entidad;

import java.util.UUID;

import com.purpura.dao.datos.ConsultarDAO;
import com.purpura.dao.datos.CrearDAO;
import com.purpura.entidad.PagoEntidad;

public interface PagoDAO extends CrearDAO<PagoEntidad>, ConsultarDAO<PagoEntidad, UUID> {

}
