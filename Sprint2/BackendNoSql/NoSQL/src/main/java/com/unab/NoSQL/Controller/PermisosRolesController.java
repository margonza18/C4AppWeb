package com.unab.NoSQL.Controller;

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

import com.unab.NoSQL.Collection.PermisosRoles;
import com.unab.NoSQL.IService.IPermisosRolesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/ModuleSecurity/permissionsRoles")

public class PermisosRolesController {

	@Autowired
	private IPermisosRolesService service;
	
	
	@GetMapping
	public List<PermisosRoles> all() {
		return service.all();
	}

	@GetMapping("{id}")
	public Optional<PermisosRoles> show(@PathVariable String id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public PermisosRoles save(@RequestBody PermisosRoles permisosRoles) {
		return service.save(permisosRoles);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public PermisosRoles update(@PathVariable String id, @RequestBody PermisosRoles permisosRoles) {
		Optional<PermisosRoles> op = service.findById(id);

		if (!op.isEmpty()) {
			PermisosRoles permisosRolesUpdate = op.get();
			permisosRolesUpdate.setPermisoId(permisosRoles.getPermisoId());
			permisosRolesUpdate.setRolId(permisosRoles.getRolId());						
			return service.save(permisosRolesUpdate);
		}

		return permisosRoles;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		service.delete(id);
	}

}
