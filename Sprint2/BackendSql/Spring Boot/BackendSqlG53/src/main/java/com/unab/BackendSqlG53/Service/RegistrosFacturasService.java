package com.unab.BackendSqlG53.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.BackendSqlG53.Entity.RegistrosFacturas;
import com.unab.BackendSqlG53.IRepository.IRegistrosFacturasRepository;
import com.unab.BackendSqlG53.IService.IRegistrosFacturasService;

import java.util.List;

@Service
public class RegistrosFacturasService implements IRegistrosFacturasService {

	@Autowired IRegistrosFacturasRepository repository;

	@Override
	public List<RegistrosFacturas> all() {
		return repository.findAll();
	}

	@Override
	public Optional<RegistrosFacturas> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public RegistrosFacturas save(RegistrosFacturas registrosFacturas) {
		return repository.save(registrosFacturas);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}


	



}