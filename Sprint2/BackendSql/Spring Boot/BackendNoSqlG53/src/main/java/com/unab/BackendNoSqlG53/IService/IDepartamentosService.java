package com.unab.BackendNoSqlG53.IService;

import java.util.List;

import java.util.Optional;

import com.unab.BackendNoSqlG53.Colletion.Departamentos;

public interface IDepartamentosService {
	public List<Departamentos> all();

	public Optional<Departamentos> findById(String id);

	public Departamentos save(Departamentos departamentos);

	public void delete(String id);
	
}
