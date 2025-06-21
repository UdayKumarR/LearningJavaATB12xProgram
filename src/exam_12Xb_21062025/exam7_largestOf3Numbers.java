package exam_12Xb_21062025;

import java.util.Scanner;

public class exam7_largestOf3Numbers {
    public static void main(String[] args) {
        int a = 260;
        int b = 100;
        int c = 200;

        if(a > b && a > c){
            System.out.println("The greatest number of three is " + a);
        } else if (b > c) {
            System.out.println("The greatest number of three is " + b);
        } else
            System.out.println("The greatest number of three is " + c);
    }
}
