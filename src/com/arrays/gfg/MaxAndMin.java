package com.arrays.gfg;

public class MaxAndMin {

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,1,2,3,0};
        findMaxAndMin(arr);
    }

    private static void findMaxAndMin(int[] arr) {
        if(arr.length == 0){
            System.out.println("There are no max and min");
        }
        else if(arr.length == 1){
            System.out.println("Min Value is :"+arr[0] + ", Max Value is :"+arr[0]);
        }
        else {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            System.out.println("Min Value is :"+min + ", Max Value is :"+max);
        }
    }
}
