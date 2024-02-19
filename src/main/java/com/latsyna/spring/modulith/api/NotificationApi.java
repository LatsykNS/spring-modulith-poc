package com.latsyna.spring.modulith.api;

import java.time.DayOfWeek;
import java.util.logging.Logger;
import com.latsyna.spring.modulith.notification.Notification;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.modulith.moments.DayHasPassed;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Notification API.
 */
@RequestMapping("/api/notifications")
@RestController
public class NotificationApi {

  private final Logger LOG = Logger.getLogger(NotificationApi.class.getName());

  private final ApplicationEventPublisher event;

  public NotificationApi(ApplicationEventPublisher event) {
    this.event = event;
  }

  @PostMapping
  public void sendNotification(@RequestBody Notification dto) {
    LOG.info("Notification to be sent: " + dto.message());
    event.publishEvent(dto);
  }


  @EventListener
  public void on(final DayHasPassed dayHasPassed) {
    var passedDate = dayHasPassed.getDate();
    LOG.info("Day has passed: " + dayHasPassed.getDate());
      if (passedDate.getDayOfWeek() == DayOfWeek.FRIDAY) {
        event.publishEvent(new Notification("Remember to buy something!"));
      }
    }

}
