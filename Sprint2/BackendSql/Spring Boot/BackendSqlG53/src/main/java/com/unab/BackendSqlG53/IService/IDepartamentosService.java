package com.unab.BackendSqlG53.IService;

import java.util.List;

import java.util.Optional;

import com.unab.BackendSqlG53.Entity.Departamentos;

public interface IDepartamentosService {
	public List<Departamentos> all();

	public Optional<Departamentos> findById(Integer id);

	public Departamentos save(Departamentos departamentos);

	public void delete(Integer id);
	
}
