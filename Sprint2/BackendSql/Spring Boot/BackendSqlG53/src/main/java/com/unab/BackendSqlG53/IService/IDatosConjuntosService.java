package com.unab.BackendSqlG53.IService;

import java.util.List;

import java.util.Optional;

import com.unab.BackendSqlG53.Entity.DatosConjuntos;



public interface IDatosConjuntosService {
	public List<DatosConjuntos> all();

	public Optional<DatosConjuntos> findById(Integer id);

	public DatosConjuntos save(DatosConjuntos datosConjuntos);

	public void delete(Integer id);
	
}
