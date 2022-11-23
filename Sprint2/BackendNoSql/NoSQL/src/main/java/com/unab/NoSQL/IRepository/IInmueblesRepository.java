package com.unab.NoSQL.IRepository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.NoSQL.Collection.Inmuebles;




public interface IInmueblesRepository  extends MongoRepository<Inmuebles, String>{

}
