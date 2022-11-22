package com.unab.BackendNoSqlG53.IService;

import java.util.List;

import java.util.Optional;

import com.unab.BackendNoSqlG53.Colletion.CostesAdministraciones;

public interface ICostesAdministracionesService {

	public List<CostesAdministraciones> all();

	public Optional<CostesAdministraciones> findById(String id);

	public CostesAdministraciones save(CostesAdministraciones costesAdministraciones);

	public void delete(String id);
	
}
