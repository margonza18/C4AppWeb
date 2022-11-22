package com.unab.BackendNoSqlG53.IService;

import java.util.List;




import java.util.Optional;

import com.unab.BackendNoSqlG53.Colletion.Bitacoras;


public interface IBitacorasService {
	public List<Bitacoras> all();

	public Optional<Bitacoras> findById(String id);

	public Bitacoras save(Bitacoras bitacoras);

	public void delete(String id);
	
}
