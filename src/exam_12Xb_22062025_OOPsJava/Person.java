package exam_12Xb_22062025_OOPsJava;

public class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }


    public static void main(String[] args) {
        Person P1 = new Person("John", 25);
        Person P2 = new Person("Alice", 30);

        System.out.printf("Name : %s , Age : %d", P1.name, P1.age).println();
        System.out.printf("Name : %s , Age : %d", P2.name, P2.age).println();
    }
}
