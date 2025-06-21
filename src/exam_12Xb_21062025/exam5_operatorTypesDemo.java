package exam_12Xb_21062025;


public class exam5_operatorTypesDemo {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;

        System.out.println("Demonstrating Operators Usage");
        System.out.println("-----------------------------");
        System.out.println("Addition of numbers: " + (a + b));
        System.out.println("Substraction of numbers : " + (a - b));
        System.out.println("Multiplication of numbers : " + (a * b));
        System.out.println("Remainder of numbers : " + (a % b));
        System.out.println("Quotient of numbers : " + (double) (a / b));
        System.out.println("Ternary operation of numbers : " + ( a < b ? "True" : "False"));
        System.out.println("Increment operation on a : " + ++a);
        System.out.println("Decrement operation on b : " + --b);


    }
}
