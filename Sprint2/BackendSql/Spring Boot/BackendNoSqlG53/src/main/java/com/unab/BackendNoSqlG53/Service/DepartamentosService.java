package com.unab.BackendNoSqlG53.Service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.BackendNoSqlG53.Colletion.Departamentos;
import com.unab.BackendNoSqlG53.IRepository.IDepartamentosRepository;
import com.unab.BackendNoSqlG53.IService.IDepartamentosService;


@Service
public class DepartamentosService implements IDepartamentosService {

	@Autowired IDepartamentosRepository repository;

	@Override
	public List<Departamentos> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Departamentos> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Departamentos save(Departamentos departamentos) {
		return repository.save(departamentos);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}

	
}
