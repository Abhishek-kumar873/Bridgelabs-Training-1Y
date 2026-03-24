package com.gla.arrays;

public class greatestElement {
    static public void main(String args[]) {
        int max = 0;
        int arr[] = {1,2,3,4,5,6,7,8};
        for(int i = 0; i<arr.length;i++){
            if(arr[i]> max){
                max= arr[i];
            }
        }
        System.out.println("Max element is: "+max);
    }
}
