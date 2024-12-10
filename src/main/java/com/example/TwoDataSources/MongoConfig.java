package com.example.TwoDataSources;


import jakarta.persistence.EntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;



//@Configuration
//@EnableMongoRepositories(basePackages = "com.example.TwoDataSources.Repository.NoSql")
public class MongoConfig // extends AbstractMongoClientConfiguration
{
//
//    @Override
//    protected String getDatabaseName() {
//        return "test";
//    }
//
//
//    @Bean
//    public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
//        return new JpaTransactionManager(emf);
//    }
//
//    @Bean
//    public MongoTemplate mongoTemplate() {
//        return new MongoTemplate(new SimpleMongoClientDatabaseFactory("mongodb://127.0.0.1:27017/test"));
//    }

}
