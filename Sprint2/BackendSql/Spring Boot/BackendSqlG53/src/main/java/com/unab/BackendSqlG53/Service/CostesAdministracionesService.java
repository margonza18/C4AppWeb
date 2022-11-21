package com.unab.BackendSqlG53.Service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.BackendSqlG53.Entity.CostesAdministraciones;
import com.unab.BackendSqlG53.IRepository.ICostesAdministracionesRepository;
import com.unab.BackendSqlG53.IService.ICostesAdministracionesService;

@Service
public class CostesAdministracionesService implements ICostesAdministracionesService {

	@Autowired ICostesAdministracionesRepository repository;

	@Override
	public List<CostesAdministraciones> all() {
		return repository.findAll();
	}

	@Override
	public Optional<CostesAdministraciones> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public CostesAdministraciones save(CostesAdministraciones costesAdministraciones) {
		return repository.save(costesAdministraciones);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

}
