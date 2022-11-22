package com.unab.BackendNoSqlG53.Service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.BackendNoSqlG53.Colletion.Inmuebles;
import com.unab.BackendNoSqlG53.IRepository.IInmueblesRepository;
import com.unab.BackendNoSqlG53.IService.IInmueblesService;



@Service
public class InmueblesService implements IInmueblesService{

	@Autowired IInmueblesRepository repository;

	@Override
	public List<Inmuebles> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Inmuebles> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Inmuebles save(Inmuebles inmuebles) {
		return repository.save(inmuebles);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}

}
