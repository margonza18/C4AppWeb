package com.unab.NoSQL.IRepository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.NoSQL.Collection.TiposInmuebles;


public interface ITiposInmueblesRepository  extends MongoRepository<TiposInmuebles, String>{

}
