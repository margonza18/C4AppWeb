package com.unab.NoSQL.IRepository;




import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.NoSQL.Collection.Bitacoras;


public interface IBitacorasRepository  extends MongoRepository<Bitacoras, String>{

}
