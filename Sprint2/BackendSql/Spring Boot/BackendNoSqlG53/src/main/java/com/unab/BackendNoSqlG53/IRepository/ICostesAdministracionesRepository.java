package com.unab.BackendNoSqlG53.IRepository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.BackendNoSqlG53.Colletion.CostesAdministraciones;




public interface ICostesAdministracionesRepository  extends MongoRepository<CostesAdministraciones, String>{

}
