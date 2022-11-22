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

import com.unab.BackendSqlG53.Entity.Ciudades;
import com.unab.BackendSqlG53.IService.ICiudadesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/ModuleParameters/cities")
public class CiudadesController {
	
	@Autowired
	private ICiudadesService service;
	
	
	@GetMapping
	public List<Ciudades> all() {
		return service.all();
	}

	@GetMapping("{id}")
	public Optional<Ciudades> show(@PathVariable Integer id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Ciudades save(@RequestBody Ciudades ciudades) {
		return service.save(ciudades);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Ciudades update(@PathVariable Integer id, @RequestBody Ciudades ciudades) {
		Optional<Ciudades> op = service.findById(id);

		if (!op.isEmpty()) {
			Ciudades ciudadesUpdate = op.get();
			ciudadesUpdate.setCodigo(ciudades.getCodigo());
			ciudadesUpdate.setNombre(ciudades.getNombre());						
			ciudadesUpdate.setEstado(ciudades.getEstado());
			ciudadesUpdate.setDepartamentoId(ciudades.getDepartamentoId());
			return service.save(ciudadesUpdate);
		}

		return ciudades;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}

}
