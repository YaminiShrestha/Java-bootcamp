package com.ttnCompany.day1;

 class Bank {

    public void getDetail() {
        System.out.println("Details...");
    }
}

        class SBI extends Bank {

            public void getDetail() {
                System.out.println("SBI bank interest rate: 4%");
            }
        }

        class BOI extends Bank {
            public void getDetail() {
                System.out.println("BOI bank interest rate: 4.5%");
            }
        }

        class ICICI extends Bank{

            public void getDetail() {
                System.out.println("ICICI bank interest rate: 4.75%");
            }
        }
class Ques11{
        public static void main(String[] args) {
            Bank obj = new Bank();
            obj.getDetail();
            SBI obj1 = new SBI();
            obj1.getDetail();
        }
    }



