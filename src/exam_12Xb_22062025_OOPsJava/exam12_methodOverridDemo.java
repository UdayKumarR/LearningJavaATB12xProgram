package exam_12Xb_22062025_OOPsJava;

public class exam12_methodOverridDemo {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Parent p2 = new Child();
        p1.display();
        p2.display();
    }
}
class Parent {
    public void display(){
        System.out.print(" Parent class display method");
    }
}

class Child extends Parent{
    @Override
    public void display() {
        System.out.print(" Child class display method");
    }
}