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

import com.unab.BackendSqlG53.Entity.BitacorasFacturas;
import com.unab.BackendSqlG53.IService.IBitacorasFacturasService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/ModulePayments/billsBinnacles")
public class BitacorasFacturasController {

	
	@Autowired
	private IBitacorasFacturasService service;
	
	
	@GetMapping
	public List<BitacorasFacturas> all() {
		return service.all();
	}

	@GetMapping("{id}")
	public Optional<BitacorasFacturas> show(@PathVariable Integer id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public BitacorasFacturas save(@RequestBody BitacorasFacturas bitacorasFacturas) {
		return service.save(bitacorasFacturas);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public BitacorasFacturas update(@PathVariable Integer id, @RequestBody BitacorasFacturas bitacorasFacturas) {
		Optional<BitacorasFacturas> op = service.findById(id);

		if (!op.isEmpty()) {
			BitacorasFacturas bitacorasFacturasUpdate = op.get();
			bitacorasFacturasUpdate.setReferenciaPago(bitacorasFacturas.getReferenciaPago());
			bitacorasFacturasUpdate.setEstadoFactura(bitacorasFacturas.getEstadoFactura());						
			bitacorasFacturasUpdate.setFechaPago(bitacorasFacturas.getFechaPago());
			bitacorasFacturasUpdate.setReferenciaCodigoBanco(bitacorasFacturas.getReferenciaCodigoBanco());
			bitacorasFacturasUpdate.setEstado(bitacorasFacturas.getEstado());
			return service.save(bitacorasFacturasUpdate);
		}

		return bitacorasFacturas;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
}