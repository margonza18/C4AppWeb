package com.unab.BackendSqlG53.IService;

import java.util.List;
import java.util.Optional;

import com.unab.BackendSqlG53.Entity.RegistrosServicios;

public interface IRegistrosServiciosService {
	public List<RegistrosServicios> all();

	public Optional<RegistrosServicios> findById(Integer id);

	public RegistrosServicios save(RegistrosServicios registrosServicios);

	public void delete(Integer id);
}
