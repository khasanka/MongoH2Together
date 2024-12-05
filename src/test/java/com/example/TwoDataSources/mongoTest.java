package com.example.TwoDataSources;

import com.example.TwoDataSources.Entity.ClientMongo;
import com.example.TwoDataSources.Repository.NoSql.UserNoSqlRepository;
import org.h2.engine.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

@DataMongoTest
public class mongoTest {


    @Autowired
    private UserNoSqlRepository userRepository;

    @Test
    public void testInsertAndRetrieveUser() {
        ClientMongo user = new ClientMongo(1L, "John Doe", "john@example.com");
        userRepository.save(user);

        ClientMongo foundUser = userRepository.findById(String.valueOf(user.getId())).orElse(null);

    }

}
