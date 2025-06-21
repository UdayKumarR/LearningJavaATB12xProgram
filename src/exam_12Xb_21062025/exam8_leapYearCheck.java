package exam_12Xb_21062025;

import java.util.Scanner;

public class exam8_leapYearCheck {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the number of the year : ");
        int year = sc.nextInt();

        if((year%4==0 && year%400==0) || (year%100!=0))
            System.out.printf("Entered year %d is leap year",  year);
        else
            System.out.printf("Enter year %d is not a leap year",  year);

        }

    }
