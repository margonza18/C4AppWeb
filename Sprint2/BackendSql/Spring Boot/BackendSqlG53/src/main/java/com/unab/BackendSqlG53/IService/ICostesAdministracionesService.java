package com.unab.BackendSqlG53.IService;

import java.util.List;

import java.util.Optional;

import com.unab.BackendSqlG53.Entity.CostesAdministraciones;

public interface ICostesAdministracionesService {

	public List<CostesAdministraciones> all();

	public Optional<CostesAdministraciones> findById(Integer id);

	public CostesAdministraciones save(CostesAdministraciones costesAdministraciones);

	public void delete(Integer id);
	
}