package com.assignment.task_4;

import java.util.*;

public class Answer_7 {
    public static void main(String[] args) {
        int[] input = {2,2,3,3,4,4,4,11,11,11,11};

        List<Integer> store_input = new ArrayList<>();
        // O(n)
        for(int i = 0; i< input.length; i++){
            if(!store_input.contains(input[i])){
                store_input.add(input[i]);
            }
        }
        int idx = 0;
        for(int num: store_input){
            input[idx] = num;
            idx++;
        }

        for(int i = idx; i < input.length; i++){
            input[i] = 0;
        }

        for(int n : input){
            System.out.print(n + " ");
        }







    }
}
