/**
 * 
 */
package com.springboot.microservice.helloworld.controller;

/**
 * @author balajisoundarrajan
 *
 */
public class HelloWorldBean {
	
	private String message;
	private String hostname;
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the hostname
	 */
	public String getHostname() {
		return hostname;
	}
	/**
	 * @param hostname the hostname to set
	 */
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	
	

}
