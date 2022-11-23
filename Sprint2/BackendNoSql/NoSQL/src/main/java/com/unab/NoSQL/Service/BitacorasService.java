package com.unab.NoSQL.Service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.NoSQL.Collection.Bitacoras;
import com.unab.NoSQL.IRepository.IBitacorasRepository;
import com.unab.NoSQL.IService.IBitacorasService;

@Service 

public class BitacorasService implements IBitacorasService {
	
	@Autowired IBitacorasRepository  repository;

	@Override
	public List<Bitacoras> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Bitacoras> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Bitacoras save(Bitacoras bitacoras) {
		return repository.save(bitacoras);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}

}
