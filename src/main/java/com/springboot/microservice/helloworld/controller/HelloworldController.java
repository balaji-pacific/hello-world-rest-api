/**
 * 
 */
package com.springboot.microservice.helloworld.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author balajisoundarrajan
 *
 */
@RestController
public class HelloworldController {

	Logger logger = LoggerFactory.getLogger(HelloworldController.class);
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		logger.info("Hello World");
		String podName = new String();
		try {
			Optional<String> podNameOptional = Optional.ofNullable(System.getenv("HOSTNAME"));
			if(!podNameOptional.isEmpty()) {
				logger.info("Its not null " + podNameOptional.get());
				podName = podNameOptional.get();
			}
			logger.info("Pod name " + podName);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return "Hello World " + podName;
	}
	
	
	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		logger.info("Hello World Bean");
		String podName = new String();
		HelloWorldBean helloWorldBean = new HelloWorldBean();
		try {
			Optional<String> podNameOptional = Optional.ofNullable(System.getenv("HOSTNAME"));
			if(!podNameOptional.isEmpty()) {
				logger.info("Its not null " + podNameOptional.get());
				podName = podNameOptional.get();
			}
			helloWorldBean.setHostname(podName);
			helloWorldBean.setMessage("Hello World");
			logger.info("Pod name " + podName);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return helloWorldBean;
	}
}
