package com.unab.BackendSqlG53.IService;

import java.util.List;

import java.util.Optional;

import com.unab.BackendSqlG53.Entity.Ciudades;

public interface ICiudadesService {

	
	public List<Ciudades> all();

	public Optional<Ciudades> findById(Integer id);

	public Ciudades save(Ciudades ciudades);

	public void delete(Integer id);
}