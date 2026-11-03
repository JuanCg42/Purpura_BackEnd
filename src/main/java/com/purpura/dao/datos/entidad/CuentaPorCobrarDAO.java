package com.purpura.dao.datos.entidad;

import java.util.UUID;

import com.purpura.dao.datos.ActualizarDAO;
import com.purpura.dao.datos.ConsultarDAO;
import com.purpura.dao.datos.CrearDAO;
import com.purpura.entidad.CuentaPorCobrarEntidad;

public interface CuentaPorCobrarDAO extends  CrearDAO<CuentaPorCobrarEntidad>, ActualizarDAO<CuentaPorCobrarEntidad, UUID>,
ConsultarDAO<CuentaPorCobrarEntidad, UUID>{

}
