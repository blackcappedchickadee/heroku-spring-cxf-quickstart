package com.cloudchirp.heroku.cxf.salesforce;

import java.util.List;

import com.sforce.soap._2005._09.outbound.NotificationPort;

/**
 * User: Heather Kinney
 * Date: 1/20/15
 * Time: 2:51 PM
 */
public class NotificationBindingImpl implements NotificationPort {

    public boolean notifications(String organizationId,
                                 String actionId,
                                 String sessionId,
                                 String enterpriseUrl,
                                 String partnerUrl,
                                 List<com.sforce.soap._2005._09.outbound.TestAutomationCNotification> notification) {

        System.out.println("Hello There.");
        System.out.println(notification.get(0).getSObject().getMessageC().getValue());

        return true;
    }

}

