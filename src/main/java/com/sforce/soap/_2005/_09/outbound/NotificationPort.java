package com.sforce.soap._2005._09.outbound;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.6
 * Tue Jan 20 15:49:54 EST 2015
 * Generated source version: 2.2.6
 * 
 */
 
@WebService(targetNamespace = "http://soap.sforce.com/2005/09/outbound", name = "NotificationPort")
@XmlSeeAlso({com.sforce.soap.enterprise.sobject.ObjectFactory.class,ObjectFactory.class})
public interface NotificationPort {

    @WebResult(name = "Ack", targetNamespace = "http://soap.sforce.com/2005/09/outbound")
    @RequestWrapper(localName = "notifications", targetNamespace = "http://soap.sforce.com/2005/09/outbound", className = "com.sforce.soap._2005._09.outbound.Notifications")
    @ResponseWrapper(localName = "notificationsResponse", targetNamespace = "http://soap.sforce.com/2005/09/outbound", className = "com.sforce.soap._2005._09.outbound.NotificationsResponse")
    @WebMethod
    public boolean notifications(
        @WebParam(name = "OrganizationId", targetNamespace = "http://soap.sforce.com/2005/09/outbound")
        java.lang.String organizationId,
        @WebParam(name = "ActionId", targetNamespace = "http://soap.sforce.com/2005/09/outbound")
        java.lang.String actionId,
        @WebParam(name = "SessionId", targetNamespace = "http://soap.sforce.com/2005/09/outbound")
        java.lang.String sessionId,
        @WebParam(name = "EnterpriseUrl", targetNamespace = "http://soap.sforce.com/2005/09/outbound")
        java.lang.String enterpriseUrl,
        @WebParam(name = "PartnerUrl", targetNamespace = "http://soap.sforce.com/2005/09/outbound")
        java.lang.String partnerUrl,
        @WebParam(name = "Notification", targetNamespace = "http://soap.sforce.com/2005/09/outbound")
        java.util.List<com.sforce.soap._2005._09.outbound.TestAutomationCNotification> notification
    );
}
