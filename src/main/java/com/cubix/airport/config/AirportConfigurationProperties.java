package com.cubix.airport.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "airport")
@Component
public class AirportConfigurationProperties {

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    private Discount discount;

    public static class Discount{

        public Special getSpecial() {
            return special;
        }

        public void setSpecial(Special special) {
            this.special = special;
        }

        private Special special;

        public static class Special{
            public int getLimit() {
                return limit;
            }

            public void setLimit(int limit) {
                this.limit = limit;
            }

            public int getLowerPercent() {
                return lowerPercent;
            }

            public void setLowerPercent(int lowerPercent) {
                this.lowerPercent = lowerPercent;
            }

            public int getHigherPercent() {
                return higherPercent;
            }

            public void setHigherPercent(int higherPercent) {
                this.higherPercent = higherPercent;
            }

            private int limit;
            private int lowerPercent;
            private int higherPercent;
        }
    }
}
