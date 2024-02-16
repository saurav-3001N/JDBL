package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class L8SbStudentCurdApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(L8SbStudentCurdApiApplication.class, args);
		System.out.println("Application is active");
	}

}

/*
 * API Flow:
 * http://localhost:8080/student/test
 * 
 * ************
 * http://localhost:8080/student/create
 * i/p:
 * {
    "name" : "Saurav",
    "email" : "saurav@gmail.com",
    "password" : "password"
}
 * 
 * O/P:
 * {
    "id": 0,
    "name": "Saurav",
    "email": "saurav@gmail.com"
}


http://localhost:8080/student/get/0

{
    "id": 0,
    "email": "saurav@gmail.com",
    "name": "Saurav",
    "password": "password"
}
 * 
 */

