package com.unab.BackendNoSqlG53.IService;

import java.util.List;

import java.util.Optional;

import com.unab.BackendNoSqlG53.Colletion.Permisos;

public interface IPermisosService {

	
	public List<Permisos> all();

	public Optional<Permisos> findById(String id);

	public Permisos save(Permisos permisos);

	public void delete(String id);
}
