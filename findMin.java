package com.company;

public class findMin {

    public static void main(String[] args) {
	    int[] array = {3, 3, 6, 9, 8, 2, 2, 5, 4};
        System.out.println(findMin(array));

    }

    public static int findMin(int[] arr){
        int theSmallest = arr[0];
        for(int i = 0; i < arr.length ; i++){
            if(theSmallest < arr[i]){
                continue;
            } else {
                theSmallest = arr[i];
            }
        }
        return theSmallest;

    }
}
