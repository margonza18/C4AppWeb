package com.unab.BackendNoSqlG53.IRepository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.BackendNoSqlG53.Colletion.Inmuebles;








public interface IInmueblesRepository  extends MongoRepository<Inmuebles, String>{

}
