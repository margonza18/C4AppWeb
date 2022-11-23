package com.unab.NoSQL.IRepository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.NoSQL.Collection.CostesAdministraciones;







public interface ICostesAdministracionesRepository  extends MongoRepository<CostesAdministraciones, String>{

}
