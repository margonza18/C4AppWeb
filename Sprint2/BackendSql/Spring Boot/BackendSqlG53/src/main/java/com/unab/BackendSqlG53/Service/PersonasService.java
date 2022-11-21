package com.unab.BackendSqlG53.Service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.BackendSqlG53.Entity.Personas;
import com.unab.BackendSqlG53.IRepository.IPersonasRepository;
import com.unab.BackendSqlG53.IService.IPersonasService;

@Service
public class PersonasService implements IPersonasService {

	@Autowired IPersonasRepository repository;

	@Override
	public List<Personas> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Personas> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public Personas save(Personas personas) {
		return repository.save(personas);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}
}