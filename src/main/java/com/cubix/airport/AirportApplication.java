package com.cubix.airport;

import com.cubix.airport.service.DiscountService;
import com.cubix.airport.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirportApplication implements CommandLineRunner {

	@Autowired
	DiscountService discountService;
	@Autowired
	PriceService priceService;

	public static void main(String[] args) {
		SpringApplication.run(AirportApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(priceService.getFinalPrice(100));
		System.out.println(priceService.getFinalPrice(2000));
		System.out.println(discountService.getDiscountPercent(100));
	}
}
