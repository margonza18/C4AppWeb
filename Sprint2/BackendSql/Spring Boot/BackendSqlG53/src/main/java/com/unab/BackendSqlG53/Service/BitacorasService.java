package com.unab.BackendSqlG53.Service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.BackendSqlG53.Entity.Bitacoras;
import com.unab.BackendSqlG53.IRepository.IBitacorasRepository;
import com.unab.BackendSqlG53.IService.IBitacorasService;

@Service

public class BitacorasService implements IBitacorasService {
	
	@Autowired IBitacorasRepository repository;

	@Override
	public List<Bitacoras> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Bitacoras> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public Bitacoras save(Bitacoras bitacoras) {
		return repository.save(bitacoras);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

}