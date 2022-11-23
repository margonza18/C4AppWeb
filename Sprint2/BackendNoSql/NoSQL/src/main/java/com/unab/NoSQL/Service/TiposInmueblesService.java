package com.unab.NoSQL.Service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.NoSQL.Collection.TiposInmuebles;
import com.unab.NoSQL.IRepository.ITiposInmueblesRepository;
import com.unab.NoSQL.IService.ITiposInmueblesService;

@Service
public class TiposInmueblesService implements ITiposInmueblesService {

	@Autowired ITiposInmueblesRepository repository;

	@Override
	public List<TiposInmuebles> all() {
		return repository.findAll();
	}

	@Override
	public Optional<TiposInmuebles> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public TiposInmuebles save(TiposInmuebles tiposInmuebles) {
		return repository.save(tiposInmuebles);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}

}
