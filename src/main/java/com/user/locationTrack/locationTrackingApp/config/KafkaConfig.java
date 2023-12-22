package com.user.locationTrack.locationTrackingApp.config;

import com.user.locationTrack.locationTrackingApp.constants.ApplicationConstant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics = ApplicationConstant.LOCATION_UPDATE_TOPIC, groupId = ApplicationConstant.GROUP_ID)
    public void updatedLocation(String value){
        System.out.println("current location is "+ value);
    }
}
