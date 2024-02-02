package com.assignment.task_7;

import java.util.*;

public class Answer_10 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // putting random values
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("ten", 10);
        //Print before sorting

        System.out.println("Before Sorting: ");

        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // sort by keys

        TreeMap<String, Integer> sorted_by_keys = new TreeMap<>(map);


        System.out.println("\nAfter sorting by keys: ");

        for(Map.Entry<String, Integer> entry: sorted_by_keys.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
