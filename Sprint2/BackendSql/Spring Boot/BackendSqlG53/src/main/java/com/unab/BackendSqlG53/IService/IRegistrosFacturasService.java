package com.unab.BackendSqlG53.IService;

import java.util.List;
import java.util.Optional;

import com.unab.BackendSqlG53.Entity.RegistrosFacturas;

public interface IRegistrosFacturasService {

	public List<RegistrosFacturas> all();

	public Optional<RegistrosFacturas> findById(Integer id);

	public RegistrosFacturas save(RegistrosFacturas registrosFacturas);

	public void delete(Integer id);
	
	
}
