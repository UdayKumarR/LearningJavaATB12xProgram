package exam_12Xb_21062025;

import java.util.Scanner;

public class exam6_posit_Neg_Zero_Check {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();

        if(a < 0){
            System.out.println("Number is negative : " + a );
        }else if (a > 0){
            System.out.println("Number is positive : " + a );
        }else
            System.out.println("Number is Zero" );


    }
}
