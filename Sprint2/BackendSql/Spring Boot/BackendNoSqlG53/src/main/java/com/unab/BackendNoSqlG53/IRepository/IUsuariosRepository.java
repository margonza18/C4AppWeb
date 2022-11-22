package com.unab.BackendNoSqlG53.IRepository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.BackendNoSqlG53.Colletion.Usuarios;






public interface IUsuariosRepository  extends MongoRepository<Usuarios, String>{

}
