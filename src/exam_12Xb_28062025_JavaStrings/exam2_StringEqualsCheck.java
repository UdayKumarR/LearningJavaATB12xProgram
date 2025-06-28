package exam_12Xb_28062025_JavaStrings;

public class exam2_StringEqualsCheck {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";

        System.out.print(" equals() using '=':  "+(s1==s2)+" ");

        System.out.print(" equals() :  "+s1.equals(s2)+" " );

        System.out.print(" equalsIgnoreCase() : "+s1.equalsIgnoreCase(s2)+" ");

        System.out.print(" compareto() : "+s1.compareTo(s2));

    }
}
