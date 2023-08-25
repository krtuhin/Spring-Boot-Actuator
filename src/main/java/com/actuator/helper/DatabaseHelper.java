package com.actuator.helper;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DatabaseHelper implements HealthIndicator {

    //method for checking health status
    public boolean checkHealth() {

        //custom hardware related logics

        return true;
    }

    //method to return status to actuator
    @Override
    public Health health() {

        if (checkHealth()) {

            return Health.up().withDetail("Database Service", "Database is running...!").build();

        } else {
            return Health.down().build();
        }
    }
}
