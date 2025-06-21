package exam_12Xb_21062025;

import java.util.Scanner;

public class exam10_simpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the operator (+,-,*,%,/) for operations on 10 and 20:");
        String a = sc.next();
        int i = 10;
        int j = 23;
        switch (a)
        {
            case "+":
                System.out.println("The sum of 10 and 20 : " + (i+j));
                break;
            case "-":
                System.out.println("The difference of 10 and 20 : " + (j-i));
                break;
            case "*":
                System.out.println("The product of 10 and 20 : " + (j*i));
                break;
            case "/":
                System.out.println("The quotient of 10 and 20 : " + (j/i));
                break;
            case "%":
                System.out.println("The reminder of 10 and 20 : " + (j%i));
                break;
            default:
                System.out.println("No operation can be done for this operator");

        }
    }
}
