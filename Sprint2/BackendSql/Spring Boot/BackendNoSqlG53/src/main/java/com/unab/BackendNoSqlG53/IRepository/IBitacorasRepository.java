package com.unab.BackendNoSqlG53.IRepository;




import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.BackendNoSqlG53.Colletion.Bitacoras;

public interface IBitacorasRepository  extends MongoRepository<Bitacoras, String>{

}