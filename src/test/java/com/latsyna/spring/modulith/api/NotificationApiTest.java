package com.latsyna.spring.modulith.api;

import com.latsyna.spring.modulith.notification.Notification;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.modulith.moments.support.TimeMachine;
import org.springframework.modulith.test.ApplicationModuleTest;
import org.springframework.modulith.test.PublishedEvents;
import org.springframework.test.context.TestPropertySource;

import java.time.Duration;


/**
 * Test for {@link NotificationApi}.
 */
@ApplicationModuleTest(ApplicationModuleTest.BootstrapMode.DIRECT_DEPENDENCIES)
@TestPropertySource(properties = "spring.modulith.moments.enable-time-machine=true")
class NotificationApiTest {


    @Autowired
    private NotificationApi notificationApi;

    @Autowired
    private TimeMachine timeMachine;

    @Test
    void sendNotification() {
        notificationApi.sendNotification(new Notification("test"));
    }


    @Test
    void sendNotificationToCustomer(final PublishedEvents publishedEvents) {
        timeMachine.shiftBy(Duration.ofDays(7));
    }
}