## A Quickstart for Heroku + Java + Apache CXF with Spring

This source is a clone from https://github.com/erikkramer/heroku-spring-cxf-quickstart.

Gives a base from which to deploy SOAP (jax-ws) based web services. The main impetus for this project is to have a SOAP endpoint deployed on Heroku for a Salesforce Outbound Workflow process to consume.

## Details

This project is mavenized, so as long as you have Maven, Java, Git, and the Heroku Toolbelt installed, you can:

    $ mvn clean package

...and then
 
    $ foreman start web

to run the app locally using Foreman (part of the Heroku Toolbelt). Foreman will examine the profile to determine what to run.





