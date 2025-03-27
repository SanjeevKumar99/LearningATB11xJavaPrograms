package Misc_Concept;

import java.util.Scanner;

public class Lab003_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the YEAR: ");
        int year = sc.nextInt();

        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println(year + "--> LEAP YEAR");
        }else {
            System.out.println(year +"--> NOT LEAP YEAR");
        }
    }
}
