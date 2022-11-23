package com.unab.NoSQL.IService;

import java.util.List;


import java.util.Optional;

import com.unab.NoSQL.Collection.TiposInmuebles;

public interface ITiposInmueblesService {

	public List<TiposInmuebles> all();

	public Optional<TiposInmuebles> findById(String id);

	public TiposInmuebles save(TiposInmuebles tiposInmuebles);

	public void delete(String id);
}