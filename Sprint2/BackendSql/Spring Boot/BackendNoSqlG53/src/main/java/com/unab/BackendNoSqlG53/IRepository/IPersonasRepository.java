package com.unab.BackendNoSqlG53.IRepository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.BackendNoSqlG53.Colletion.Personas;





public interface IPersonasRepository  extends MongoRepository<Personas, String>{

}
