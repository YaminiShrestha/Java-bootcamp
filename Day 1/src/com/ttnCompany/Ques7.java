/*
Write a program to print your Firstname,LastName & age
using static block,static method & static variable respectively.
 */
package com.ttnCompany;

public class Ques7 {

        static String firstName= "";
    static String lastName= "";
        static int age;

        // start of static block
        static {
            firstName="Mohan";
            lastName="Singh";
            age= 25;
            System.out.println("static block called ");

        }


        public static void details(String fName,String lName,int age)
        {
              firstName =fName;
              lastName = lName;
              age=age;
              System.out.println(firstName+" "+ lastName+" "+ age);
        }




        public static void main(String args[]) {

            System.out.println(Ques7.firstName +" "+ Ques7.lastName+" " + Ques7.age);
System.out.println("Static Method called");
            Ques7 obj = new Ques7();
            details("Shyam","Raj",50);
       ;


        }
    }



