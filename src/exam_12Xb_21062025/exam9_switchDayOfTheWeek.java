package exam_12Xb_21062025;

import java.util.Scanner;

public class exam9_switchDayOfTheWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the day from 1 to 7 :");
        int a = sc.nextInt();
        switch (a)
        {
                case 1:
                    System.out.println("The day is Sunday");
                    break;
                case 2:
                    System.out.println("The day is Monday");
                    break;
                case 3:
                    System.out.println("The day is Tuesday");
                    break;
                case 4:
                    System.out.println("The day is Wednesday");
                    break;
                case 5:
                    System.out.println("The day is Thursday");
                    break;
                case 6:
                    System.out.println("The day is Friday");
                    break;
                case 7:
                    System.out.println("The day is Saturday");
                    break;
                default:
                    System.out.println("No day exists for this number");

            }
    }
}
