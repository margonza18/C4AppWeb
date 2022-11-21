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

import com.unab.BackendSqlG53.Entity.ServiciosAdicionales;
import com.unab.BackendSqlG53.IService.IServiciosAdicionalesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/ModuleServices/servicesAdditional")
public class ServiciosAdicionalesController {
	
	@Autowired
	private IServiciosAdicionalesService service;
	
	
	@GetMapping
	public List<ServiciosAdicionales> all() {
		return service.all();
	}

	@GetMapping("{id}")
	public Optional<ServiciosAdicionales> show(@PathVariable Integer id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public ServiciosAdicionales save(@RequestBody ServiciosAdicionales serviciosAdicionales) {
		return service.save(serviciosAdicionales);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ServiciosAdicionales update(@PathVariable Integer id, @RequestBody ServiciosAdicionales serviciosAdicionales) {
		Optional<ServiciosAdicionales> op = service.findById(id);

		if (!op.isEmpty()) {
			ServiciosAdicionales serviciosAdicionalesUpdate = op.get();
			serviciosAdicionalesUpdate.setMesCobro(serviciosAdicionales.getMesCobro());	
			serviciosAdicionalesUpdate.setValorMes(serviciosAdicionales.getValorMes());	
			serviciosAdicionalesUpdate.setEstado(serviciosAdicionales.getEstado());
			serviciosAdicionalesUpdate.setRegistrosServiciosId(serviciosAdicionales.getRegistrosServiciosId());
			serviciosAdicionalesUpdate.setTiposInmueblesId(serviciosAdicionales.getTiposInmueblesId());
			return service.save(serviciosAdicionalesUpdate);
		}

		return serviciosAdicionales;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
	

}
