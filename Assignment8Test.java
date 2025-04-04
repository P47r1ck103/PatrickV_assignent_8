package com.coderscampus.assignment;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException

public class Assignment8Test {

@Test
public void getData(){
    Assignment8 assignment = new Assignment8();

CompleteableFuture<List<Integer>>[] futures = new CompleteableFuture[1000];
 for(int i = 0; i <1ooo; i++){
    futures[i] = CompleteableFutures.supplyAsync(() -> assignment.getNumbers());
 }
 CompleteableFuture.allOf(futures).join();
 for(CompleteableFuture<List<Integer>> future : futures){
    try{
        system.out.println(future.get());
    }catch (InterruptedException | ExecutionException e){
        system.out.println(e);
        }
     }
}
@Test
public void Should_count_unique_numbers(){
    Assignment8 assignment = new Assignment8();

    CompleteableFuture<List<Integer>>[] futures = new CompleteableFuture[1000];

    for(int i = 0; i < 1000; i++){
        futures[i] = CompletableFutue.supplyAsync(() -> assignment.getNumbers());
    }
    CompleteableFuture.allOf(futures).join();
    
    Map<Integer, Integer> numberCountMap = new HashMap<>();

    for(CompletableFutue<List<Integer>> future : futures) {
        try{
            List<Integer> numbersList = future.get();
            for(Integer num : numberList){
                numberCountMap.put(num, numberCountMap.getOrDefault(num, 0) + 1);
            }
        }catch(InterruptedException | ExecutionException e){
            system.out.println(e);
        }
    }
        for(int i = 1; i <= 10; i++){
            system.out.println(i + "=" + numberCountMap.getOrDefault(i, 0));
        }
    }
}
