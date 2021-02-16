/*
Write a program to find the number of occurrences of the duplicate words in a string and print them
   Input:"Welcome to Java Session  Java Session Session"
   Output: Java - 2
           Session - 3
 */

package com.ttnCompany.day1;
public class Ques2 {

    public static void main(String[] args) {
        String input="Welcome to Java Session  Java Session Session";
        String[] words=input.split(" ");  //Split the word from String
        int count=1;
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {

                if(words[i].equals(words[j]))
                {
                    count= count +1;
                    words[j]="0";
                }
            }
            if(words[i]!="0" && count >1)
                System.out.println(words[i]+" - "+count);
            count=1;

        }
    }
    }

