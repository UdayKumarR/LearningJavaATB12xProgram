package exam_12Xb_21062025;

import java.util.Scanner;

public class exam12_printFactorial {
    public static long factorialfunc(int n) throws Exception{
        long fact = 1;
        if(n > 0)
        {
            for(int i=1;i<=n;i++){
                fact = fact*i;
            }
        }else if (n == 0)
            fact = 1;
        else
            throw new Exception("Factorial cannot be found for a negative number");
        return fact;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to find factorial of that number: ");
        int a = sc.nextInt();
        System.out.println("Factorial of number "+a+" is : "+factorialfunc(a));
    }
}
