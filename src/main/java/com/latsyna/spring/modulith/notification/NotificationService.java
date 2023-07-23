package com.latsyna.spring.modulith.notification;

import java.util.logging.Logger;
import org.springframework.modulith.ApplicationModuleListener;
import org.springframework.stereotype.Service;

/**
 * The notification service.
 */
@Service
public class NotificationService {

    private final Logger LOG = Logger.getLogger(NotificationService.class.getName());

    @ApplicationModuleListener
    public void receivedSmSNotification(Notification event) {
        LOG.info("Sms sent with text: " + event.message());
    }

    @ApplicationModuleListener
    public void receivedEmailNotification(Notification event) {
        LOG.info("Email sent with text: " + event.message());
    }

}
