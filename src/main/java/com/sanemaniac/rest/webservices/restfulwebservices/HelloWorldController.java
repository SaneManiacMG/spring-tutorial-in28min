package com.sanemaniac.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {

	//GET
	//URI - /hello-world
	//method - "hello world"
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world-request")
	public String helloWorldPost() {
		return "Hello World using RequestMapping";
	}
    //GET mapping
	//URI - /hello-world-get
	@GetMapping(path = "/hello-world-get")
	public String helloWorldGet() {
		return "Hello World using GetMapping";
	}

	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
	}
	
	//hello-world/path-variable/username
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
	
}
