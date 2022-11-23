package com.unab.NoSQL.IService;

import java.util.List;


import java.util.Optional;

import com.unab.NoSQL.Collection.Bitacoras;


public interface IBitacorasService {
	public List<Bitacoras> all();

	public Optional<Bitacoras> findById(String id);

	public Bitacoras save(Bitacoras bitacoras);

	public void delete(String id);
	
}
