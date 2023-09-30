package Parking_System;
import  java.util.Scanner;
public class Test {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int menu;

        int b=0,by=0,s=0;
        int amount=0, count=0;

       /// int t,u,v;

        while (true) {
            System.out.println("*******************************************");
            System.out.println("Press 1 For Bike");
            System.out.println("Press 2 For Bicycle");
            System.out.println("Press 3 For Scooty");
            System.out.println("Press 4 For Show The Record");
            System.out.println("Press 5 For Delete");
            System.out.println("*******************************************");
            menu = sc.nextInt();

            if (menu == 1) {
                if (count <= 50){
                    b++;
                amount = amount + 25;
                count = count + 1;
            }
                else {
                    System.out.println("Parking  area is full");
                }
            }
            else if (menu == 2) {
                if(count<=50) {
                    by++;
                    amount = amount + 15;
                    count = count + 1;
                }
                else {
                    System.out.println("Parking area is full ");
                }
            }
            else if (menu == 3) {
                if(count<=50) {
                    s++;
                    amount = amount + 20;
                    count = count + 1;
                }
                else {
                    System.out.println("Parking area is full");
                }
            }
            else if (menu == 4) {
                System.out.println("*******************************************");
                System.out.println("Total amount =" + amount);
                System.out.println("Total number of vehicle parked =" + count);
                System.out.println("Total number of Bike  Parked =" + b);
                System.out.println("Total number of Bicycle  Parked =" + b);
                System.out.println("Total number of Scooty  Parked =" + s);
                System.out.println("*******************************************");
            }

            else if (menu == 5) {
                amount = 0;
                count = 0;
                b=0;
                by=0;
                s=0;
            }
        }
    }
}
