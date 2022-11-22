package com.unab.BackendNoSqlG53.IRepository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.BackendNoSqlG53.Colletion.DatosConjuntos;





public interface IDatosConjuntosRepository  extends MongoRepository<DatosConjuntos, String>{

}
