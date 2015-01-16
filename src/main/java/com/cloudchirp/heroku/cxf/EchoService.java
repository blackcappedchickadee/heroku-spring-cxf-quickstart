package com.cloudchirp.heroku.cxf;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
*
* @author cloudchirp
* 
*/
@WebService
public interface EchoService {

	public String getMessage(@WebParam(name = "message") String message);
}
