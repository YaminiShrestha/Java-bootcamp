/*
     Find common elements between two arrays.
        Input:Array1 = {4, 7, 3, 9, 8};
              Array2= {3, 2, 1, 5, 40, 9, 4};
        Output:{4,3,9}
  */

package com.ttnCompany.day1;

public class Ques5 {
    public static void main(String[] args) {
        int[] arr1 = {4, 7, 3, 9, 8};
        int[] arr2 = {3, 2, 1, 5, 40, 9, 4};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
