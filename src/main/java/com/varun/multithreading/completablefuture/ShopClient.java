package com.varun.multithreading.completablefuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class ShopClient {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Shop shop = new Shop();
        List<Double> productPrices = new ArrayList<>();
        long start = System.currentTimeMillis();
        String[] products = {"Milk", "Sugar", "Tea", "Fruits", "Beets", "Carrot", "Oil"};
        /*for (String product: products) {
            productPrices.add(shop.getPrice(product));
        }*/
        long end = System.currentTimeMillis();
        System.out.println("Product prices in sync, Time taken : " + (end - start) / 1000);
        System.out.println(productPrices);

        productPrices.clear();

        start = System.currentTimeMillis();
        List<Future<Double>> productPricesInFuture = new ArrayList<>();
        for (String product: products) {
            productPricesInFuture.add(shop.getPriceAsync(product));
        }
        for (Future<Double> futurePrice : productPricesInFuture) {
            productPrices.add(futurePrice.get());
        }
        end = System.currentTimeMillis();
        System.out.println("Product prices in Async, Time taken : " + (end - start) / 1000);
        System.out.println(productPrices);
    }
}
