package com.unab.BackendSqlG53.Service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.BackendSqlG53.Entity.DatosConjuntos;
import com.unab.BackendSqlG53.IRepository.IDatosConjuntosRepository;
import com.unab.BackendSqlG53.IService.IDatosConjuntosService;

@Service
public class DatosConjuntosService implements IDatosConjuntosService {

	@Autowired IDatosConjuntosRepository repository;

	@Override
	public List<DatosConjuntos> all() {
		return repository.findAll();
	}

	@Override
	public Optional<DatosConjuntos> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public DatosConjuntos save(DatosConjuntos datosConjuntos) {
		return repository.save(datosConjuntos);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}


}