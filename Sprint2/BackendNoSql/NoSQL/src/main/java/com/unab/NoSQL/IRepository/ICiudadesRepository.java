package com.unab.NoSQL.IRepository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.NoSQL.Collection.Ciudades;




public interface ICiudadesRepository  extends MongoRepository<Ciudades, String>{

}
