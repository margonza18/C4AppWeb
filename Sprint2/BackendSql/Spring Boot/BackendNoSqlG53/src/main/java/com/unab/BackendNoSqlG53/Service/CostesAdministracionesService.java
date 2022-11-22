package com.unab.BackendNoSqlG53.Service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.BackendNoSqlG53.Colletion.CostesAdministraciones;
import com.unab.BackendNoSqlG53.IRepository.ICostesAdministracionesRepository;
import com.unab.BackendNoSqlG53.IService.ICostesAdministracionesService;


@Service
public class CostesAdministracionesService implements ICostesAdministracionesService {

	@Autowired ICostesAdministracionesRepository repository;

	@Override
	public List<CostesAdministraciones> all() {
		return repository.findAll();
	}

	@Override
	public Optional<CostesAdministraciones> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public CostesAdministraciones save(CostesAdministraciones costesAdministraciones) {
		return repository.save(costesAdministraciones);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}

}
