package com.unab.NoSQL.IRepository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.NoSQL.Collection.DatosConjuntos;






public interface IDatosConjuntosRepository  extends MongoRepository<DatosConjuntos, String>{

}
