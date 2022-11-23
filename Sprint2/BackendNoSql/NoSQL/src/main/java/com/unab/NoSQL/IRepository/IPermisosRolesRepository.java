package com.unab.NoSQL.IRepository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.NoSQL.Collection.PermisosRoles;


public interface IPermisosRolesRepository  extends MongoRepository<PermisosRoles, String>{

}
