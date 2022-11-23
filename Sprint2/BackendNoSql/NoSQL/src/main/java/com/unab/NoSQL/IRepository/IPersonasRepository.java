package com.unab.NoSQL.IRepository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.NoSQL.Collection.Personas;

public interface IPersonasRepository  extends MongoRepository<Personas, String>{

}
