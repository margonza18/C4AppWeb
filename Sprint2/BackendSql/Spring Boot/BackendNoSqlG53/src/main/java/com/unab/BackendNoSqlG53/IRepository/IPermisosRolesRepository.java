package com.unab.BackendNoSqlG53.IRepository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.BackendNoSqlG53.Colletion.PermisosRoles;





public interface IPermisosRolesRepository  extends MongoRepository<PermisosRoles, String>{

}
