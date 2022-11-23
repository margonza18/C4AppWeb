package com.unab.NoSQL.Service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.NoSQL.Collection.Usuarios;
import com.unab.NoSQL.IRepository.IUsuariosRepository;
import com.unab.NoSQL.IService.IUsuariosService;

@Service
public class UsuariosService implements IUsuariosService{

	@Autowired IUsuariosRepository repository;

	@Override
	public List<Usuarios> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Usuarios> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Usuarios save(Usuarios usuarios) {
		return repository.save(usuarios);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}

}
