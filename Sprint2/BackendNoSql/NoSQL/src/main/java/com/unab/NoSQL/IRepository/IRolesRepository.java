package com.unab.NoSQL.IRepository;




import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.NoSQL.Collection.Roles;

public interface IRolesRepository  extends MongoRepository<Roles, String>{

}
