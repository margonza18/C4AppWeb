package com.unab.BackendSqlG53.Service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.BackendSqlG53.Entity.Ciudades;
import com.unab.BackendSqlG53.IRepository.ICiudadesRepository;
import com.unab.BackendSqlG53.IService.ICiudadesService;

@Service
public class CiudadesService implements ICiudadesService{

	@Autowired ICiudadesRepository repository;

	@Override
	public List<Ciudades> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Ciudades> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public Ciudades save(Ciudades ciudades) {
		return repository.save(ciudades);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

}