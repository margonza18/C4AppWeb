package com.unab.BackendNoSqlG53.IRepository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.BackendNoSqlG53.Colletion.Ciudades;

public interface ICiudadesRepository  extends MongoRepository<Ciudades, String>{

}
