package com.unab.BackendNoSqlG53.IService;

import java.util.List;

import java.util.Optional;

import com.unab.BackendNoSqlG53.Colletion.Ciudades;

public interface ICiudadesService {

	
	public List<Ciudades> all();

	public Optional<Ciudades> findById(String id);

	public Ciudades save(Ciudades ciudades);

	public void delete(String id);
}
