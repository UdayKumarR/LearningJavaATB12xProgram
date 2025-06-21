package exam_12Xb_21062025;

import java.util.Scanner;

public class exam14_printPatternUsingNestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print the pattern : ");
        int a = sc.nextInt();
        System.out.println("Right Angle Triangle");
        System.out.println("--------------------");
        for(int i=1;i<=a;i++){
            System.out.println();
            for(int j=1;j<=i;j++)
                System.out.print("*");
        }
        System.out.println();
        System.out.println("============================");
        System.out.println("Reverse Right Angle Triangle");
        System.out.println("----------------------------");
        for(int i=a;i>=1;i--){
            System.out.println();
            for(int j=i;j>=1;j--)
                System.out.print("*");
        }

    }

}
