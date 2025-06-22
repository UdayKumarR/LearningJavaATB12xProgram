package exam_12Xb_22062025_OOPsJava;


public class exam14_multiExcepHandling extends Exception {
    public static void main(String[] args)
    {
        int[] a = new int[5];
        String [] numbers = {"10", "5", "abc", "2"};
        try {
            String g = "15";
            int result = Integer.parseInt(g) / 0;
        }
        catch (ArithmeticException e) {
            System.err.print("ArithmeticException : Cannot divide by zero ");
        }
        try{
            for(int i=0; i<numbers.length;i++)
                a[i]=Integer.parseInt(numbers[i]);
        }
        catch (NumberFormatException e) {
            System.err.print("NumberFormatException : Invalid number format ");
        }
        try {
            System.out.println(a[6]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.print("ArrayIndexOutOfBoundsException : Array index out of bounds ");
        }
        finally {
            System.out.println("All Exceptions are checked in the program");
        }
    }
}
