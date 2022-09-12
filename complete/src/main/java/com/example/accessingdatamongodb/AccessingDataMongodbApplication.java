package com.example.accessingdatamongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccessingDataMongodbApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataMongodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// fetch all Students
		System.out.println("Students found with findAll():");
		System.out.println("-------------------------------");
		for (Student Student : repository.findAll()) {
			System.out.println(Student);
		}
		System.out.println();

		// fetch an individual Student
		System.out.println("Student found with findByFirstName('Jack'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("JACK"));

		System.out.println("Students found with findByLastName('DOE'):");
		System.out.println("--------------------------------");
		for (Student Student : repository.findByLastName("JAMES")) {
			System.out.println(Student);
		}

	}

}
