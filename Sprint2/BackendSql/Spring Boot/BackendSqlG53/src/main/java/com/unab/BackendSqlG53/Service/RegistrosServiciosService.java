package com.unab.BackendSqlG53.Service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.BackendSqlG53.Entity.RegistrosServicios;
import com.unab.BackendSqlG53.IRepository.IRegistrosServiciosRepository;
import com.unab.BackendSqlG53.IService.IRegistrosServiciosService;



@Service 
public class RegistrosServiciosService implements IRegistrosServiciosService{

	@Autowired IRegistrosServiciosRepository  repository;

	@Override
	public List<RegistrosServicios> all() {
		return repository.findAll();
	}

	@Override
	public Optional<RegistrosServicios> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public RegistrosServicios save(RegistrosServicios registrosServicios) {
		return repository.save(registrosServicios);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

}
