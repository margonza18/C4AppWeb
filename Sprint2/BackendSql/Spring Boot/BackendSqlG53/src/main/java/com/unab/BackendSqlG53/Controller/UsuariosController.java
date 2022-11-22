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

import com.unab.BackendSqlG53.Entity.Usuarios;
import com.unab.BackendSqlG53.IService.IUsuariosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/ModuleSecurity/user")
public class UsuariosController {

	@Autowired
	private IUsuariosService service;
	
	
	@GetMapping
	public List<Usuarios> all() {
		return service.all();
	}

	@GetMapping("{id}")
	public Optional<Usuarios> show(@PathVariable Integer id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Usuarios save(@RequestBody Usuarios usuarios) {
		return service.save(usuarios);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Usuarios update(@PathVariable Integer id, @RequestBody Usuarios usuarios) {
		Optional<Usuarios> op = service.findById(id);

		if (!op.isEmpty()) {
			Usuarios usuariosUpdate = op.get();
			usuariosUpdate.setUsuario(usuarios.getUsuario());
			usuariosUpdate.setContrasenia(usuarios.getContrasenia());						
			usuariosUpdate.setEstado(usuarios.getEstado());
			usuariosUpdate.setPersonaId(usuarios.getPersonaId());
			usuariosUpdate.setRolId(usuarios.getRolId());
			return service.save(usuariosUpdate);
		}

		return usuarios;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
}
