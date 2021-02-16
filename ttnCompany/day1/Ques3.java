/* Write a program to find the number of occurrences of a character in a string without using loop
   Input: Java is a programming language
   output: Number of occurrences of a in Java is a programming language   = 6
 */
package com.ttnCompany.day1;

public class Ques3 {
    public static void main(String[] args) {
        String str = "Java is a programming language  ";
        int count = str.length() - str.replace("a", "").length();
        System.out.println("Number of occurrences of 'a' in "+str+" = "+count);
    }
}
