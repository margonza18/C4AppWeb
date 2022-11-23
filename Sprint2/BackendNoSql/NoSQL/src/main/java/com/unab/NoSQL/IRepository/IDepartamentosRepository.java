package com.unab.NoSQL.IRepository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.NoSQL.Collection.Departamentos;




public interface IDepartamentosRepository  extends MongoRepository<Departamentos, String>{

}
