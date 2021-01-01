package com.arrays.gfg;

import java.util.ArrayList;
import java.util.List;

public class MaxAndSecondMax {

    public static void main(String[] args) {
        int arr[] = {3,6,1,3,5,8,0,45,21,54,66,23, 110, 120};
//        int arr[] = {2,1,2};
        ArrayList<Integer> result = new ArrayList<>();
        result = findMaxAndSecondMax(arr);
        System.out.println("the result is:"+ result);
    }

    private static ArrayList<Integer> findMaxAndSecondMax(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        if(arr.length == 0)
            return al;
        else{
            for(int i=0;i<arr.length;i++) {
                if (max < arr[i]) {
                    secondMax = max;
                    max = arr[i];
                }
                else if (secondMax < arr[i] && max != arr[i]) {
                    secondMax = arr[i];
                }
            }
            al.add(max);
            al.add(secondMax);
        }
        return al;
    }
}
