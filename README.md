## A Quickstart for Heroku + Java + Apache CXF with Spring

This source is a clone from https://github.com/erikkramer/heroku-spring-cxf-quickstart.

Gives a base from which to deploy SOAP (jax-ws) based web services. The main impetus for this project is to have a SOAP endpoint deployed on Heroku for a Salesforce Outbound Workflow process to consume.

[![Deploy to Heroku](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy?template=https://github.com/blackcappedchickadee/heroku-spring-cxf-quickstart)


## Details

This project is mavenized, so as long as you have Maven, Java, Git, and the Heroku Toolbelt installed, you can:

    $ mvn clean package

...and then to run the app locally using Foreman (part of the Heroku Toolbelt):
 
    $ foreman start web

Foreman will examine the profile to determine what to run.


## Salesforce Configurations
### This section is still very much a work in progress...

Although not needed for the initial demonstration of exposing Java classes as SOAP-based web services, if you want to integrate this with Salesforce, the following must take place (as of Winter '15, may change with upcoming Salesforce releases):

0. Register for a free Salesforce Developer account.

1. Create a custom Salesforce object called 'Test Automation' (the API name should be 'Test_Automation__c').

2. Create three custom fields: Message - Text(100), Stuff - Checkbox, Subject - Text Area(255).

3. Navigate: Create -> Workflows & Approvals -> Workflow Rules. 

4. Select the 'Test Automation' object in the first step.

5. For the second step, provide a Rule Name of 'Test Request', keep the Evaluation Criteria set to the default (created, and anytime it's edited to subsequently meet criteria), and under Rule Criteria - select 'Test Automation: Stuff' under the field column, select 'equals' under the operator column, and 'True' under the value column.

6. Use Save and Next to navigate to the third step in setting up the Workflow Actions for this Rule.

7. Select 'New Outbound Message' from the Add Workflow Actions dropdown in the Immediate Workflow Actions section.

8. You will be brought to the 'Configure Outbound Message' screen.

9. Provide a unique 'Name' (the Unique Name will be automatically provided).

10. In 'Endpoint URL', provide a publicly-available URL. Salesforce will send a SOAP message to this endpoint. For example: http://morning-fortress-3703.herokuapp.com/testAutomationService.

    Note: At this point, we are simply defining where the SOAP message will be sent. No implementation is defined at this point.

11. Check 'Send Session ID', and add the three custom fields (Message__c, Stuff__c, Subject__c) so they're in the list of selected fields to send.

12. Save, and you will be returned to the third step. Use 'Done' to complete the setup.

13. From the Workflow Rule Detail for the rule you just created, locate the new Outbound Message you just created under Immediate Workflow Actions, and click on the description to view the details screen.

14. Locate the field labeled 'Endpoint WSDL', and click on the 'Click for WSDL' link. Save this WSDL locally for future use.

Now that we have the WSDL from Salesforce, we turn our attention back to this source code. We need to generate the Java artifacts from the WSDL using CXF.

### Use CXF via Maven to generate Java artifacts from the Salesforce WSDL

15. Use a maven profile (cxf-codegen) to - on request - generate the Java artifacts from the Salesforce WSDL.

    $ mvn clean -Pcxf-codegen

16. Create a new Java class that implements the NotificationPort. In this case, a NotificationBindingImpl class was created.

More to come...



