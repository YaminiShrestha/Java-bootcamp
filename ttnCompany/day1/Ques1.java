/*Write a program to replace a substring inside a string with other string.
 Input : Hello World
 Output: Wello World

* */

package com.ttnCompany.day1;

public class Ques1 {

  public static void main(String[] args) {
      String str="Hello World";

      System.out.println( str.replaceAll("He", "Wa" ));
    }
}
