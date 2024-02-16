package com.example.demo.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Student;
import com.example.demo.model.StudentPostRequestModel;
import com.example.demo.model.StudentPostResponseModel;

@Service
public class StudentService {
	
	HashMap<Integer, Student> studentHM;
	
public StudentPostResponseModel create(@RequestBody StudentPostRequestModel request) {
	if (studentHM == null) {
		studentHM = new HashMap<Integer , Student>();
	}
	Student s = new Student(request.getEmail(), request.getName(), request.getPassword());
	s.setId(getRandomNumber());
	if(studentHM.containsKey(s.getId())) {
		s.setId(getRandomNumber());
	}
	studentHM.put(s.getId(), s);
	
	StudentPostResponseModel response = new StudentPostResponseModel(s.getId(), s.getName(), s.getEmail());
	
	return response;
	
	}
      public Student getStudent(int  id) {
    	  Student s = null;
    	  if (studentHM == null) {
    		  System.out.println("HashMap is not created yet.");
    	  } 
    	  
    	  if(studentHM.containsKey(id)) {
    		  s = studentHM.get(id);
    	  }
    	  return s;
      }

private int getRandomNumber() {
	
	int min = 1, max = 10000;
	// TODO Auto-generated method stub
	return (int) ((Math.random() * (max - min)) + min);
}
	

}
