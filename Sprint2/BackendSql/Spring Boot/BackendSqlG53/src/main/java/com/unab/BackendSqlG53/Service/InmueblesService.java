package com.unab.BackendSqlG53.Service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.BackendSqlG53.Entity.Inmuebles;
import com.unab.BackendSqlG53.IRepository.IInmueblesRepository;
import com.unab.BackendSqlG53.IService.IInmueblesService;

@Service
public class InmueblesService implements IInmueblesService{

	@Autowired IInmueblesRepository repository;

	@Override
	public List<Inmuebles> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Inmuebles> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public Inmuebles save(Inmuebles inmuebles) {
		return repository.save(inmuebles);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

}
