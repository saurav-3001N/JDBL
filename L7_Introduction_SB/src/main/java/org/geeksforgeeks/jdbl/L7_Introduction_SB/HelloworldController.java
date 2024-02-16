package org.geeksforgeeks.jdbl.L7_Introduction_SB;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController



// @RestController = Controller + ResponseBody

public class HelloworldController {
	
	@RequestMapping (value = "/test")
	
	public String test() {
		return "Test API works";
	}
	
}
	
	
