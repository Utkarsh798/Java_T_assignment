package com.assignment.task_7;

import java.util.*;

public class Answer_11 {
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 3, 5, 7, 8, 6};
        int targetSum = 10;

        findSubarraysWithSum(array, targetSum);
    }


    public static void findSubarraysWithSum(int[] array, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();

        int start = 0;
        int end = 0;
        int currentSum = 0;

        while (end < array.length) {
            currentSum += array[end];

            while (currentSum > targetSum && start <= end) {
                currentSum -= array[start];
                start++;
            }

            if (currentSum == targetSum) {
                List<Integer> subarray = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    subarray.add(array[i]);
                }
                result.add(subarray);
            }

            end++;
        }

        if (result.isEmpty()) {
            System.out.println("No subarrays found with the given sum.");
        } else {
            System.out.println("Subarrays with sum " + targetSum + ":");
            for (List<Integer> subarray : result) {
                System.out.println(subarray);
            }
        }
    }
}




