package com.unab.BackendNoSqlG53.IRepository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.BackendNoSqlG53.Colletion.Departamentos;








public interface IDepartamentosRepository  extends MongoRepository<Departamentos, String>{

}
