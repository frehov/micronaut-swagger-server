package com.crappyegineering.micronaut.health;

import io.micronaut.management.health.indicator.HealthIndicator;
import io.micronaut.management.health.indicator.HealthResult;
import org.reactivestreams.Publisher;

public class ApplicationHealthCheck implements HealthIndicator {


    @Override
    public Publisher<HealthResult> getResult() {
        return null;
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
