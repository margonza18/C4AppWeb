package com.unab.BackendSqlG53.Service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.BackendSqlG53.Entity.PermisosRoles;
import com.unab.BackendSqlG53.IRepository.IPermisosRolesRepository;
import com.unab.BackendSqlG53.IService.IPermisosRolesService;

@Service
public class PermisosRolesService implements IPermisosRolesService{

	@Autowired IPermisosRolesRepository repository;

	@Override
	public List<PermisosRoles> all() {
		return repository.findAll();
	}

	@Override
	public Optional<PermisosRoles> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public PermisosRoles save(PermisosRoles permisosRoles) {
		return repository.save(permisosRoles);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

}
