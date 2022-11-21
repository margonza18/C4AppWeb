package com.unab.BackendSqlG53.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.unab.BackendSqlG53.Entity.GenerarNotificaciones;
import com.unab.BackendSqlG53.IService.IGenerarNotificacionesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/ModuleNotifications/generateNotifications")
public class GenerarNotificacionesController {
	
	
	@Autowired
	private IGenerarNotificacionesService service;
	
	
	@GetMapping
	public List<GenerarNotificaciones> all() {
		return service.all();
	}

	@GetMapping("{id}")
	public Optional<GenerarNotificaciones> show(@PathVariable Integer id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public GenerarNotificaciones save(@RequestBody GenerarNotificaciones generarNotificaciones) {
		return service.save(generarNotificaciones);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public GenerarNotificaciones update(@PathVariable Integer id, @RequestBody GenerarNotificaciones generarNotificaciones) {
		Optional<GenerarNotificaciones> op = service.findById(id);

		if (!op.isEmpty()) {
			GenerarNotificaciones generarNotificacionesUpdate = op.get();
			generarNotificacionesUpdate.setTitulo(generarNotificaciones.getTitulo());
			generarNotificacionesUpdate.setContenido(generarNotificaciones.getContenido());	
			generarNotificacionesUpdate.setFechaInicio(generarNotificaciones.getFechaInicio());
			generarNotificacionesUpdate.setFechaFinalizacion(generarNotificaciones.getFechaFinalizacion());
			generarNotificacionesUpdate.setEstado(generarNotificaciones.getEstado());
			generarNotificacionesUpdate.setUsuarioAdministradorId(generarNotificaciones.getUsuarioAdministradorId());
			return service.save(generarNotificacionesUpdate);
		}

		return generarNotificaciones;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}

}