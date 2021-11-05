package com.varun.multithreading.completablefuture;

public class Discount {
    public enum Code{
        NONE(0),
        GOLD(10),
        SILVER(8),
        PLATINUM(15);

        final int percentage;

        Code(int percentage) {
            this.percentage = percentage;
        }
    }
}
