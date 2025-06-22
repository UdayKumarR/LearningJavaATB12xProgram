package exam_12Xb_22062025_OOPsJava;

public class exam10_multInterfImplement {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();

    }
}
interface Flyable{
    public void fly();
}

interface Swimmable{
    public void swim();
}

class Duck implements Flyable,Swimmable{
    @Override
    public void fly() {
        System.out.print("Duck is flying in the sky! ");
    }

    @Override
    public void swim() {
        System.out.print("Duck is swimming in the water!");
    }
}