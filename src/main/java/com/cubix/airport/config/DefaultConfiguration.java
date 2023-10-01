package com.cubix.airport.config;

import com.cubix.airport.service.DefaultDiscountService;
import com.cubix.airport.service.DiscountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!prod")
public class DefaultConfiguration {

    @Bean
    public DiscountService discountService() {
        return new DefaultDiscountService();
    }
}
