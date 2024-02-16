package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {
	
	@RequestMapping("/test")
	public String test() {
		return "Test  API works!";
	}
	
		@GetMapping
		public String getData() {
			return "Test API works";
		}
		
		@GetMapping("/student")
		public Student getStudent() {
			Student s = new Student(1,   " Saurav",100);
			return s;
		}
		
		
		
		/*3 ways to pass request
		 * 
		 *  Request Body
		 *  Path Variable
		 *  Request Param
		 */
		
	
    @RequestMapping("/test/{name}")
    	
    	public String pathExample (@PathVariable String name) {
    	return "Hello "+ name;
    }
    
   
    
    @RequestMapping("/profile/{id}/{name}/{address}")
    public String pathExample1(@PathVariable String name, @PathVariable int id, @PathVariable String address) {
    	
    	 //localhost:8080/profile/22/saurav/nepal
    	
    	
    	return "I am " + name + " I am " + id + " years old. " +" I am from " + address;
    }
    
   
   
    //localhost:8080/profile?name=SAURAV
    //localhost:8080/<PathVariable>?<RequestParam>&<RequestParam>
    
    @RequestMapping("/")
    public String queryParamExample(@RequestParam String name) {
    	return "Hello"+name;
    }
     @PostMapping("/post")
     public String postStudnet(@RequestBody Student student) {
    	 System.out.println(student);
    	 return student.toString();
     }
}
  