package com.example.TwoDataSources;

import com.example.TwoDataSources.Entity.ClientRDB;
import com.example.TwoDataSources.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class TwoDataSourcesApplication {



	public static void main(String[] args) {
		SpringApplication.run(TwoDataSourcesApplication.class, args);
	}

}
