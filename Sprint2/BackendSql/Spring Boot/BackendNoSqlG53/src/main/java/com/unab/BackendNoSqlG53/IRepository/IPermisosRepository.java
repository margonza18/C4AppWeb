package com.unab.BackendNoSqlG53.IRepository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.BackendNoSqlG53.Colletion.Permisos;








public interface IPermisosRepository  extends MongoRepository<Permisos, String>{

}
