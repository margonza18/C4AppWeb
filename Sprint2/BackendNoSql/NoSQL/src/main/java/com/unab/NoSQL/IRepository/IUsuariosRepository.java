package com.unab.NoSQL.IRepository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.NoSQL.Collection.Usuarios;

public interface IUsuariosRepository  extends MongoRepository<Usuarios, String>{

}
