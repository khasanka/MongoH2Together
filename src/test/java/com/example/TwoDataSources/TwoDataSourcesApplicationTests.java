package com.example.TwoDataSources;

import com.example.TwoDataSources.Entity.ClientMongo;
import com.example.TwoDataSources.Entity.ClientRDB;
import com.example.TwoDataSources.Model.UserDTO;
import com.example.TwoDataSources.Service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.AutoConfigureDataMongo;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Scanner;



//@DataMongoTest // This annotation sets up an embedded MongoDB instance
//@DataMongoTest()
@SpringBootTest
@ExtendWith(SpringExtension.class)
class TwoDataSourcesApplicationTests {


	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {


		UserDTO clientRDB = new UserDTO();

		clientRDB.setName("CLient name ------");

		clientRDB.setEmail("Client address ------");

		UserDTO savedClientRDB = userService.saveUser(clientRDB);

		System.out.println(" ========>>>>>>  User added successfully : " + clientRDB);
	}

}
