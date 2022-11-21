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

import com.unab.BackendSqlG53.Entity.RegistrosFacturas;
import com.unab.BackendSqlG53.IService.IRegistrosFacturasService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/ModulePayments/billsRegister")
public class RegistrosFacturasController {

	
	@Autowired
	private IRegistrosFacturasService service;
	
	
	@GetMapping
	public List<RegistrosFacturas> all() {
		return service.all();
	}

	@GetMapping("{id}")
	public Optional<RegistrosFacturas> show(@PathVariable Integer id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public RegistrosFacturas save(@RequestBody RegistrosFacturas registrosFacturas) {
		return service.save(registrosFacturas);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public RegistrosFacturas update(@PathVariable Integer id, @RequestBody RegistrosFacturas registrosFacturas) {
		Optional<RegistrosFacturas> op = service.findById(id);

		if (!op.isEmpty()) {
			RegistrosFacturas registrosFacturasUpdate = op.get();
			registrosFacturasUpdate.setReferenciaPago(registrosFacturas.getReferenciaPago());
			registrosFacturasUpdate.setValorTotal(registrosFacturas.getValorTotal());
			registrosFacturasUpdate.setMes(registrosFacturas.getMes());
			registrosFacturasUpdate.setEstado(registrosFacturas.getEstado());
			registrosFacturasUpdate.setCostesAdministracionesId(registrosFacturas.getCostesAdministracionesId());
			registrosFacturasUpdate.setInmueblesId(registrosFacturas.getInmueblesId());
			registrosFacturasUpdate.setBitacorasFacturasId(registrosFacturas.getBitacorasFacturasId());
			return service.save(registrosFacturasUpdate);
		}

		return registrosFacturas;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
}