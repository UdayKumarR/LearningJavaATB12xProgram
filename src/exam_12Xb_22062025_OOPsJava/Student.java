package exam_12Xb_22062025_OOPsJava;

public class Student {
        private String name;
        private int rollNo;
        private String section;

        public Student(String name, int rollNo, String section) {
            this.name = name;
            this.rollNo = rollNo;
            this.section = section;
        }

        public void printDetails() {
            System.out.println("Printing Student Details:");
            System.out.printf("Student : %s , RollNo : %d , Section : %s",this.name,this.rollNo,this.section).println();
        }


        public static void main(String[] args) {
            Student S1 = new Student("Bob", 101, "A");
                S1.printDetails();

        }
}
