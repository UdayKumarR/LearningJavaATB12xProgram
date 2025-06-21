package exam_12Xb_21062025;


public class exam2_stringConcatNumbers {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        String s1 = "Java";
        String s2 = "ATB12X";
        System.out.println(a+b+s1+s2); //output : 50JavaATB12X
        System.out.println(s1+s2+a+b); //output : JavaATB12X2030
        System.out.println(a+s1+s2+b); //output : 20JavaATB12X30
        System.out.println(s1+a+b+s2); //output : Java2030ATB12X
        System.out.println(s1+a+s2+b); //output : Java20ATB12X30
    }
}
