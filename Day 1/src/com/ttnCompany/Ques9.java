/*Write a program to display values of enums using a
 constructor & getPrice() method (Example display house & their prices)
       Input: house1(900),house2(2),house3(50),house4(15),house5(12)
       Output:house1 costs 90 thousand dollars.
              house2 costs 20 thousand dollars.
              house3 costs 5 thousand dollars.
              house4 costs 19 thousand dollars.
              house5 costs 12 thousand dollars.

 */

package com.ttnCompany;

public class Ques9 {
    enum House {
        house1(90),house2(20),house3(5),house4(19),house5(12);
        private int price;
        House(int p) {
            price = p;
        }
        int getPrice() {

            return price;
        }
    }

        public static void main(String args[]){
            System.out.println("All House prices:");
            for (House h: House.values()) System.out.println(
                    h + " costs " + h.getPrice() + " thousand dollars.");
        }
    }

