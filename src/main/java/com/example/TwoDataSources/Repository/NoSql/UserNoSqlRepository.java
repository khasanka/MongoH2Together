package com.example.TwoDataSources.Repository.NoSql;

import com.example.TwoDataSources.Entity.ClientMongo;
import com.example.TwoDataSources.Entity.ClientRDB;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserNoSqlRepository extends MongoRepository<ClientMongo, String> {

}
