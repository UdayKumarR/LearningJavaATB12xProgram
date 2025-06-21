package exam_12Xb_21062025;

import java.util.Scanner;

public class exam13_multiplicationTableUsingNestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print table of that number : ");
        int a = sc.nextInt();

        //Multiplication Table for the Specific Number
        System.out.printf("The multiplication table of %d", a).println();
        for(int i=1;i<=12;i++){
            System.out.printf("%d * %d = %d", a,i,(a*i)).println();
        }
        System.out.println("==============================");
        //Multiplication Tables until specific number
        System.out.printf("The multiplication tables until %d", a).println();
        System.out.println("-------------------------------");
        for(int j=2;j<=a;j++){
            System.out.printf("The multiplication table of %d", j).println();
            for(int k=1;k<=12;k++){
                System.out.printf("%d * %d = %d", j,k,(j*k)).println();
            }
            System.out.println("-------------------------------");
        }
    }
}
