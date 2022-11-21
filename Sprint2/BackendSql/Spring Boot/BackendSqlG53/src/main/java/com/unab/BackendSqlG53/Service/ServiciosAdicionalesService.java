package com.unab.BackendSqlG53.Service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.BackendSqlG53.Entity.ServiciosAdicionales;
import com.unab.BackendSqlG53.IRepository.IServiciosAdicionalesRepository;
import com.unab.BackendSqlG53.IService.IServiciosAdicionalesService;


@Service
public class ServiciosAdicionalesService implements IServiciosAdicionalesService {

	@Autowired IServiciosAdicionalesRepository repository;

	@Override
	public List<ServiciosAdicionales> all() {
		return repository.findAll();
	}

	@Override
	public Optional<ServiciosAdicionales> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public ServiciosAdicionales save(ServiciosAdicionales serviciosAdicionales) {
		return repository.save(serviciosAdicionales);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
