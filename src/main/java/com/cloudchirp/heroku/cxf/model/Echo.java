package com.cloudchirp.heroku.cxf.model;

/**
*
* @author cloudchirp
* 
*/
public class Echo {

    private String message;
    
	public String getMessage() {
		return "Hello, " + message + ". This is a SOAP webserice message being returned from a Java-Spring-CXF webapp on Heroku.";
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
