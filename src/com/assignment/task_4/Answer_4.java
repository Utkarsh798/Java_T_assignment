package com.assignment.task_4;

import java.util.Scanner;

public class Answer_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,27};
        // through binary search
        int left  = 0;
        int right = arr.length - 1;

        System.out.println("Binary Search: Enter the number you want to find in Array: ");

        int target = s.nextInt();
        boolean flag = false;
        int idx = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                flag = true;
                idx = mid;
                break;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        if (flag) {
            System.out.println("Found the number at position " + idx);
        } else {
            System.out.println("Not found the number in array.");
        }
    }
}
