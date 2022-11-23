package com.unab.NoSQL.Service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.NoSQL.Collection.PermisosRoles;
import com.unab.NoSQL.IRepository.IPermisosRolesRepository;
import com.unab.NoSQL.IService.IPermisosRolesService;

@Service
public class PermisosRolesService implements IPermisosRolesService{

	@Autowired IPermisosRolesRepository repository;

	@Override
	public List<PermisosRoles> all() {
		return repository.findAll();
	}

	@Override
	public Optional<PermisosRoles> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public PermisosRoles save(PermisosRoles permisosRoles) {
		return repository.save(permisosRoles);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}

}
