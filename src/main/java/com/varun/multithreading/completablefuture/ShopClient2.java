package com.varun.multithreading.completablefuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class ShopClient2 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        List<Shop> shops = Arrays.asList(new Shop("Demar"), new Shop("KMart"), new Shop("Liddl"), new Shop("Samartha"));

        String product = "Milk";
        long start = System.currentTimeMillis();
        shops.stream()
                .map(shop -> String.format("Price from Shop : %s  is : %.2f" , shop.getShopName(), shop.getPrice(product)))
                .forEach(System.out::println);

        long end = System.currentTimeMillis();
        System.out.println("Product prices in sync, Time taken : " + (end - start) / 1000);


        //Using parallel streams
        start = System.currentTimeMillis();
        shops.parallelStream()
                .map(shop -> String.format("Price from Shop : %s  is : %.2f" , shop.getShopName(), shop.getPrice(product)))
                .forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Product prices using parallel stream, Time taken : " + (end - start) / 1000);

        //Using completable future
        start = System.currentTimeMillis();
        List<CompletableFuture<String>> completableFutureList = shops.stream()
                .map(shop -> CompletableFuture.supplyAsync(() -> String.format("Price from Shop : %s  is : %.2f" , shop.getShopName(), shop.getPrice(product))))
                .collect(Collectors.toList());

        completableFutureList.stream()
                .map(CompletableFuture::join)
                .forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Product prices using completable future, Time taken : " + (end - start) / 1000);
    }
}
