package com.arrays.gfg;

public class MaxOfAnArray {

    public static void main(String[] args) {
        int arr[] = {2,5,7,8,9,0};
        int result = findMax(arr);
        System.out.println("The Maximum element is:" + result);
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        if(arr.length == 0)
            return -1;

        for(int i=0;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
