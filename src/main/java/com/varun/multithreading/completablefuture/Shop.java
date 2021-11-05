package com.varun.multithreading.completablefuture;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class Shop {
    public  double getPrice(String product){
        return calculatePrice(product);
    }

    private void delay()  {
        try {
            Thread.sleep(1000);//To simulate expensive operation e.g An api/DB call
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public double calculatePrice(String product){
        delay();
        return new Random().nextDouble() * product.charAt(0) + product.charAt(100) ;
    }

    public Future<Double> getPriceAsync(String product) {
        /*CompletableFuture<Double> futurePrice = new CompletableFuture<>();
        new Thread(() -> {
            try {
                futurePrice.complete(calculatePrice(product));
            }catch (Exception ex){
                futurePrice.completeExceptionally(ex);
            }

        }).start();
        return futurePrice;*/
        return CompletableFuture.supplyAsync(() -> calculatePrice(product));//Has the same effect as the above code;
    }
}
