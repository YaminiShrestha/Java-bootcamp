/*
There is an array with every element repeated twice except one. Find that element
 Input:{2, 3, 5, 4, 5, 3, 4}
 Output: 2
 */
package com.ttnCompany;

public class Ques6 {
    static int findSingle(int arr[],int n)
    {

        int res = arr[0];
        for (int i = 1; i < n;i++)
            res = res ^arr[i];

        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 4, 5, 3, 4};
        int n = arr.length;
        System.out.println("Non repeated element is  "+ findSingle(arr,n));
    }
}
