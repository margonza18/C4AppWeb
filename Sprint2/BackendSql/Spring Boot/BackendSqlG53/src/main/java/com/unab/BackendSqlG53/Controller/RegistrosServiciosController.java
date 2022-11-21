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

import com.unab.BackendSqlG53.Entity.RegistrosServicios;
import com.unab.BackendSqlG53.IService.IRegistrosServiciosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/ModuleServices/registerServices")
public class RegistrosServiciosController {

	
	@Autowired
	private IRegistrosServiciosService service;
	
	
	@GetMapping
	public List<RegistrosServicios> all() {
		return service.all();
	}

	@GetMapping("{id}")
	public Optional<RegistrosServicios> show(@PathVariable Integer id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public RegistrosServicios save(@RequestBody RegistrosServicios registrosServicios) {
		return service.save(registrosServicios);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public RegistrosServicios update(@PathVariable Integer id, @RequestBody RegistrosServicios registrosServicios) {
		Optional<RegistrosServicios> op = service.findById(id);

		if (!op.isEmpty()) {
			RegistrosServicios registrosServiciosUpdate = op.get();
			registrosServiciosUpdate.setCodigo(registrosServicios.getCodigo());
			registrosServiciosUpdate.setNombre(registrosServicios.getNombre());						
			registrosServiciosUpdate.setDescripcion(registrosServicios.getDescripcion());
			registrosServiciosUpdate.setValor(registrosServicios.getValor());
			registrosServiciosUpdate.setEstado(registrosServicios.getEstado());
			return service.save(registrosServiciosUpdate);
		}

		return registrosServicios;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
}