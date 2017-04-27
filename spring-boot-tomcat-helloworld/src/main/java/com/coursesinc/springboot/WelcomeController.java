package com.coursesinc.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@RequestMapping("/hello")
	public String welcome(){
		return "HelloWorld!.... This is spring boot helloworld ran with tomcat";
	}
}
