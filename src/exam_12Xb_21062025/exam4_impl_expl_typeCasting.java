package exam_12Xb_21062025;

public class exam4_impl_expl_typeCasting {
    public static void main(String[] args) {
       int a1 = 10;
       double d1 = 7.678;

        //implicit casting
        double d2 = a1;
        System.out.println("Implicitly casted " + d2); //cast int to double

        //explicit casting
        int a2 = (int) d1;
        System.out.println("Explicitly casted " + a2); //cast explicitly using int keyword


    }
}
