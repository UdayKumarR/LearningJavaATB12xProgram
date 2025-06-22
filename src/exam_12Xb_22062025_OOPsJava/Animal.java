package exam_12Xb_22062025_OOPsJava;

public class Animal
{
    public void makeSound()
    {
        System.out.println("This is common animal sound");
    }
}
class Dog extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.print("Dog says : Woof! Woof! ");
    }
}

class Cat extends Animal
{
    @Override
    public void makeSound() {
        System.out.print("Cat says : Meow! Meow! ");
    }
}

class exam5_AnimalSound {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();
    }
}
