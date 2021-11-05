package com.varun.multithreading.completablefuture;

import java.util.Queue;

public class DiscountService {
    public static String applyDiscount(Quote quote){
        delay();
        return String.format("Shop Name: %s , Discount Code: %s, Final Price : %.2f", quote.getShopName(), quote.getDiscountCode(), apply(quote.getPrice(), quote.getDiscountCode()));
    }

    public static double apply(double price, Discount.Code code){
        return (price - (code.percentage / 100));
    }

    public static void delay(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
