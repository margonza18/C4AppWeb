package com.unab.BackendNoSqlG53.IService;

import java.util.List;

import java.util.Optional;

import com.unab.BackendNoSqlG53.Colletion.Inmuebles;

public interface IInmueblesService {
	public List<Inmuebles> all();

	public Optional<Inmuebles> findById(String id);

	public Inmuebles save(Inmuebles inmuebles);

	public void delete(String id);
}
