package com.unab.BackendNoSqlG53.Service;

import java.util.List;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.BackendNoSqlG53.Colletion.Ciudades;
import com.unab.BackendNoSqlG53.IRepository.ICiudadesRepository;
import com.unab.BackendNoSqlG53.IService.ICiudadesService;



@Service
public class CiudadesService implements ICiudadesService{

	@Autowired ICiudadesRepository repository;

	@Override
	public List<Ciudades> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Ciudades> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Ciudades save(Ciudades ciudades) {
		return repository.save(ciudades);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}

}
