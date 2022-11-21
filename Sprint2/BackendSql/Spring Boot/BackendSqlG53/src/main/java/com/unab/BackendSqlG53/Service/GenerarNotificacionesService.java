package com.unab.BackendSqlG53.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.BackendSqlG53.Entity.GenerarNotificaciones;
import com.unab.BackendSqlG53.IRepository.IGenerarNotificacionesRepository;
import com.unab.BackendSqlG53.IService.IGenerarNotificacionesService;


@Service
public class GenerarNotificacionesService implements IGenerarNotificacionesService{


	@Autowired IGenerarNotificacionesRepository repository;

	@Override
	public List<GenerarNotificaciones> all() {
		return repository.findAll();
	}

	@Override
	public Optional<GenerarNotificaciones> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public GenerarNotificaciones save(GenerarNotificaciones generarNotificaciones) {
		return repository.save(generarNotificaciones);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}
	
}
