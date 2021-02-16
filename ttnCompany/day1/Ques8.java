/*
Write a program to reverse a string and remove character from
index 4 to index 9 from the reversed string using String Buffer

Input:wandavision
Output:noisivadnaw
       noisaw
 */
package com.ttnCompany.day1;

public class Ques8 {
    public static void main(String[] args) {
        String str = "wandavision";

        // conversion from String object to StringBuffer
        StringBuffer sbr = new StringBuffer(str);
        // To reverse the string
        sbr.reverse();
        System.out.println(sbr);
        sbr.delete(4,9);
        System.out.println(sbr);

    }
}
