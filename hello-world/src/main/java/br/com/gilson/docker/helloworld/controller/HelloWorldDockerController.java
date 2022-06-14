package br.com.gilson.docker.helloworld.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldDockerController {

	@GetMapping("/hello")
	public Map<String, Object> getHelloWorldMessage(){
		Map<String, Object> message = new HashMap<>();
		message.put("message", "Hello world");
		
		return message;
	}
}
