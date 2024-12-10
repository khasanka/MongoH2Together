package com.example.TwoDataSources;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
@DataMongoTest()
@ExtendWith(SpringExtension.class)
public class mongoTest {
    @Test
//    @DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
    void example(@Autowired final MongoTemplate mongoTemplate) {
        System.out.println("-----------------Hello world-------------------------------------------");
        Assertions.assertThat(mongoTemplate.getDb()).isNotNull();
    }
}

