package com.assignment.task_4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Answer_8 {
    public static void main(String[] args) {
        int[] input = {1, 16, 2, 19, 10, 20};

//        With sorting : easy method with O(nlogn);
//        Arrays.sort(input);
//
//        System.out.println("With sorting third largest: "+ input[input.length - 3]);

        // without Sorting
        // to maintain 3

        int first_l  = Integer.MIN_VALUE;
        int second_l = Integer.MIN_VALUE;
        int third_l = Integer.MIN_VALUE;

        for(int num: input){
            if(num > first_l){
                 third_l = second_l;
                 second_l = first_l;
                 first_l = num;
            }else if(num > second_l &&  num  != first_l){
                third_l = second_l;
                second_l = num;
            }else if(num > third_l && num != first_l && num != second_l){
                third_l = num;
            }
        }

        System.out.println("Third Largest Element is: " + third_l);

    }
}
