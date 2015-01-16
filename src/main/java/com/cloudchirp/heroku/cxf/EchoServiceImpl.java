package com.cloudchirp.heroku.cxf;

import javax.jws.WebService;
import com.cloudchirp.heroku.cxf.model.Echo;


/**
*
* @author cloudchirp
* 
*/
@WebService(endpointInterface = "com.cloudchirp.heroku.cxf.EchoService")
public class EchoServiceImpl implements EchoService {
    
    public String getMessage(String message) {
    	Echo echo = new Echo();
    	echo.setMessage(message);
        return echo.getMessage();
    }

}
