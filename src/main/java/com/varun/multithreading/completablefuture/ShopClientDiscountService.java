package com.varun.multithreading.completablefuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class ShopClientDiscountService {
    public static void main(String[] args) {
        List<Shop> shops = Arrays.asList(new Shop("Demar"), new Shop("KMart"), new Shop("Liddl"), new Shop("Samartha"));

        String product = "Milk";
        long start = System.currentTimeMillis();
        shops.stream()
                .map(shop -> shop.getPriceWithDiscount(product))
                .map(Quote::parse)
                .map(DiscountService::applyDiscount)
                .forEach(System.out::println);
        long end = System.currentTimeMillis();
        System.out.println("Time taken : " + (end - start) / 1000);

        //Using CompleteAble future
        start = System.currentTimeMillis();
        List<CompletableFuture<String>> futures = shops.stream()
                .map(shop -> CompletableFuture.supplyAsync(() -> shop.getPriceWithDiscount(product)))
                .map(future -> future.thenApply(Quote::parse))
                .map(future -> future.thenCompose(quote -> CompletableFuture.supplyAsync(() -> DiscountService.applyDiscount(quote))))
                .collect(Collectors.toList());

        futures.stream()
                .map(future -> future.join())
                .forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Time taken using completeable future: " + (end - start) / 1000);


        start = System.currentTimeMillis();
        shops.parallelStream()
                .map(shop -> shop.getPriceWithDiscount(product))
                .map(Quote::parse)
                .map(DiscountService::applyDiscount)
                .forEach(System.out::println);

        end = System.currentTimeMillis();
        System.out.println("Time taken using parallel streams: " + (end - start) / 1000);
    }
}
