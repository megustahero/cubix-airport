package com.cubix.airport.service;

//@Service
public class DefaultDiscountService implements DiscountService {

    @Override
    public int getDiscountPercent(int totalPrice) {
        return 10;
    }
}
