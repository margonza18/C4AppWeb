package com.unab.BackendNoSqlG53.Service;

import java.util.List;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.BackendNoSqlG53.Colletion.DatosConjuntos;
import com.unab.BackendNoSqlG53.IRepository.IDatosConjuntosRepository;
import com.unab.BackendNoSqlG53.IService.IDatosConjuntosService;


@Service
public class DatosConjuntosService implements IDatosConjuntosService {

	@Autowired IDatosConjuntosRepository repository;

	@Override
	public List<DatosConjuntos> all() {
		return repository.findAll();
	}

	@Override
	public Optional<DatosConjuntos> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public DatosConjuntos save(DatosConjuntos datosConjuntos) {
		return repository.save(datosConjuntos);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}


}
