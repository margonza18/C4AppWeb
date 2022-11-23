package com.unab.NoSQL.IRepository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.NoSQL.Collection.Permisos;


public interface IPermisosRepository  extends MongoRepository<Permisos, String>{

}
