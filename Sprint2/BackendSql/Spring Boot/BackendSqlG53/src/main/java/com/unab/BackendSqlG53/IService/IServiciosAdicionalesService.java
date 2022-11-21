package com.unab.BackendSqlG53.IService;

import java.util.List;
import java.util.Optional;

import com.unab.BackendSqlG53.Entity.ServiciosAdicionales;

public interface IServiciosAdicionalesService {

	
	public List<ServiciosAdicionales> all();

	public Optional<ServiciosAdicionales> findById(Integer id);

	public ServiciosAdicionales save(ServiciosAdicionales serviciosAdicionales);

	public void delete(Integer id);
}
