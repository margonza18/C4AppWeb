package com.unab.BackendSqlG53.IService;

import java.util.List;
import java.util.Optional;

import com.unab.BackendSqlG53.Entity.GenerarNotificaciones;

public interface IGenerarNotificacionesService {
	public List<GenerarNotificaciones> all();

	public Optional<GenerarNotificaciones> findById(Integer id);

	public GenerarNotificaciones save(GenerarNotificaciones generarNotificaciones);

	public void delete(Integer id);
}
