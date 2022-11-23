package com.unab.NoSQL.Service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.NoSQL.Collection.Permisos;
import com.unab.NoSQL.IRepository.IPermisosRepository;
import com.unab.NoSQL.IService.IPermisosService;

@Service
public class PermisosService implements IPermisosService {

	@Autowired IPermisosRepository repository;

	@Override
	public List<Permisos> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Permisos> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Permisos save(Permisos permisos) {
		return repository.save(permisos);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}
}
