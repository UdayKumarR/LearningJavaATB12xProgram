package exam_12Xb_21062025;

public class exam3_post_pre_increment {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;

        //pre-increment example
        System.out.println("Printing Pre Increment of value from Input " + ++i);
        System.out.println("Present value " + i);


        //post-increment example
        System.out.println("Printing Post Increment of value from Input " + (j++));
        System.out.println("Present value " + j);
    }
}
