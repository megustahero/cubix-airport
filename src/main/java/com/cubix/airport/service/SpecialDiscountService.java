package com.cubix.airport.service;

import com.cubix.airport.config.AirportConfigurationProperties;
import org.springframework.beans.factory.annotation.Autowired;

import static com.cubix.airport.config.AirportConfigurationProperties.Discount.Special;

//@Service
public class SpecialDiscountService implements DiscountService{

//    @Value("${airport.discount.special.limit}")
//    private int limit;
//    @Value("${airport.discount.special.lowerPercent}")
//    private int lowerPercent;
//    @Value("${airport.discount.special.higherPercent}")
//    private int higherPercent;

    @Autowired
    private AirportConfigurationProperties config;

    @Override
    public int getDiscountPercent(int totalPrice) {
        Special specialConfig = config.getDiscount().getSpecial();
        return totalPrice > specialConfig.getLimit() ? specialConfig.getHigherPercent() : specialConfig.getLowerPercent();
    }
}
