package com.varun.generalprogramming;

import java.math.BigDecimal;

public class PreferBigDecimalOverDoubleAndFloat {
    public static void main(String[] args) {
        itemCanYouBuyUsingDouble();
        itemCanYouBuyUsingBigDecimal();
    }

    private static void itemCanYouBuyUsingDouble() {
        double funds = 1.00;
        int itemsBought = 0;
        for (double price = 0.10; funds >= price; price += 0.10) {
            funds -= price;
            itemsBought++;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Change: $" + funds);
    }

    private static void itemCanYouBuyUsingBigDecimal(){
        final BigDecimal TEN_CENTS = new BigDecimal("0.10");
        BigDecimal funds = new BigDecimal("1.00");
        int itemsBought = 0;
        for (BigDecimal price = TEN_CENTS; funds.compareTo(price) >= 0; price = price.add(TEN_CENTS)) {
            funds = funds.subtract(price);
            itemsBought++;
        }
        System.out.println(itemsBought + " items bought using bigdecimal");
        System.out.println("Change: $" + funds);
    }
}
