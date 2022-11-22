package com.unab.BackendNoSqlG53.IService;

import java.util.List;

import java.util.Optional;

import com.unab.BackendNoSqlG53.Colletion.DatosConjuntos;



public interface IDatosConjuntosService {
	public List<DatosConjuntos> all();

	public Optional<DatosConjuntos> findById(String id);

	public DatosConjuntos save(DatosConjuntos datosConjuntos);

	public void delete(String id);
	
}
