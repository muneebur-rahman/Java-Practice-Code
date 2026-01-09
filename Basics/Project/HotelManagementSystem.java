/* 
Program Name : Hotel Management System
Description  : Demonstrate the use of Basic concepts like data-types, conditional statement, ,loops, and user input.
Author       : Muneebur Rahman
 */
package Project;

import java.util.Scanner;

public class HotelManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t Welcome to Rahman Restaurent!!!");
        int buttenChickenCount = 0;
        int chickenMasalaCount = 0;
        int chickenAfghaniCount = 0;
        int TandooriRotiCount = 0;
        int butterRotiCount = 0;
        int butterNaanCount = 0;
        int garlicNaanCount = 0;
        int lacchaParathaCount = 0;
        int chickenBiryaniCount = 0;
        int specialChickenBiryaniCount = 0;
        int hyderbadiChickenBiryaniCount = 0;
        int totalCount;
        int totalAmount = 0;
        int choice;

        while (true) {

            System.out.println("--------------------------------------------------");
            System.out.println("\t Items \t\t\t | \tAmount ");
            System.out.println("--------------------------------------------------");
            System.out.println("1) Butter Chicken \t\t | \t 120 ");
            System.out.println("2) Chicken Masala \t\t | \t 150 ");
            System.out.println("3) Chicken Afghani \t\t | \t 180 ");
            System.out.println("4) Tandoori Roti \t\t | \t 20 ");
            System.out.println("5) Butter Roti \t\t\t | \t 30 ");
            System.out.println("6) Butter Naan \t\t\t | \t 50 ");
            System.out.println("7) Garlic Naan \t\t\t | \t 70 ");
            System.out.println("8) Laccha Paratha \t\t | \t 50 ");
            System.out.println("9) Chicken Biryani \t\t | \t 100");
            System.out.println("10) Special Chicken Biryani \t | \t 150 ");
            System.out.println("11) Hyderbadi Chicken Biryani \t | \t 200 ");
            System.out.println("12) Confirm Order  ");
            System.out.println("--------------------------------------------------");
            System.out.print("Enter You Choice : ");
            choice = sc.nextInt();
            System.out.println("--------------------------------------------------");
            

            if (choice == 1) {
                System.out.println("Butter Chicken Added!");
                buttenChickenCount += 1;
                totalAmount+=120;
            }

            else if (choice == 2) {
                System.out.println("Chicken Masala Added!");
                chickenMasalaCount += 1;
                totalAmount+=150;
            }

            else if (choice == 3) {
                System.out.println("Chicken Afghani Added!");
                chickenAfghaniCount += 1;
                totalAmount+=180;
            }

            else if (choice == 4) {
                System.out.println("Tandoori Roti Added!");
                TandooriRotiCount += 1;
                totalAmount+=20;
            }

            else if (choice == 5) {
                System.out.println("Butter Roti Added!");
                butterRotiCount += 1;
                totalAmount+=30;
            }

            else if (choice == 6) {
                System.out.println("Butter Naan Added!");
                butterNaanCount += 1;
                totalAmount+=50;
            }

            else if (choice == 7) {
                System.out.println("Garlic Naan Added!");
                garlicNaanCount += 1;
                totalAmount+=70;
            }

            else if (choice == 8) {
                System.out.println("Laccha Paratha Added!");
                lacchaParathaCount += 1;
                totalAmount+=50;
            }

            else if (choice == 9) {
                System.out.println("Chicken Biryani Added!");
                chickenBiryaniCount += 1;
                totalAmount+=100;
            }

            else if (choice == 10) {
                System.out.println("Special Chicken Biryani Added!");
                specialChickenBiryaniCount += 1;
                totalAmount+=150;
            }

            else if (choice == 11) {
                System.out.println("Hyderbadi Chicken Biryani Added!");
                hyderbadiChickenBiryaniCount += 1;
                totalAmount+=200;
            }

            else if (choice == 12) {
                totalCount=buttenChickenCount+chickenMasalaCount+chickenAfghaniCount+TandooriRotiCount+butterRotiCount+butterNaanCount+garlicNaanCount+lacchaParathaCount+chickenBiryaniCount+specialChickenBiryaniCount+hyderbadiChickenBiryaniCount;
                System.out.println("\t Thank You! Your Order Has Been Confirmed");
                System.out.println("------------------------------------------------------------");
                System.out.println("\t Items \t\t\t | Total Items \t | Amount");
                System.out.println("------------------------------------------------------------");
                System.out.println("1) Butter Chicken \t\t | \t "+buttenChickenCount+" \t | 120");
                System.out.println("2) Chicken Masala \t\t | \t "+chickenMasalaCount+" \t | 150");
                System.out.println("3) Chicken Afghani \t\t | \t "+chickenAfghaniCount+" \t | 180");
                System.out.println("4) Tandoori Roti \t\t | \t "+TandooriRotiCount+" \t | 20");
                System.out.println("5) Butter Roti \t\t\t | \t "+butterRotiCount+" \t | 30");
                System.out.println("6) Butter Naan \t\t\t | \t "+butterNaanCount+" \t | 50");
                System.out.println("7) Garlic Naan \t\t\t | \t "+garlicNaanCount+" \t | 70");
                System.out.println("8) Laccha Paratha \t\t | \t "+lacchaParathaCount+" \t | 50");
                System.out.println("9) Chicken Biryani \t\t | \t "+chickenBiryaniCount+" \t | 100");
                System.out.println("10) Special Chicken Biryani \t | \t "+specialChickenBiryaniCount+" \t | 150");
                System.out.println("11) Hyderbadi Chicken Biryani \t | \t "+hyderbadiChickenBiryaniCount+" \t | 200");
                System.out.println("------------------------------------------------------------");
                System.out.println("\t Total \t\t\t | \t "+totalCount+" \t | "+totalAmount);
                System.out.println("------------------------------------------------------------");
                System.out.println("\t We Look Forwar to Serving You Again!!!");
                break;
            }

            else {
                System.out.println("Please Enter Correct Choice");
            }

        }

        sc.close();

    }

}
