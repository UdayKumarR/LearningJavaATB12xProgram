package exam_12Xb_22062025_OOPsJava;

public class exam13_outerInnerClasses {
    public static void main(String[] args) {
        Outer o1 = new Outer();
        o1.display();
        o1.createAndUseInnerClass();
    }
}
class Outer{
    int x = 10;
    public void display(){
        System.out.print("Outer Class variable x : "+ x);
    }
    class Inner{
        public void display(){
            System.out.print(" Inner class accessing outer variable : "+ x);
        }
    }

    public void createAndUseInnerClass(){
        Inner inner = new Inner();
        inner.display();
    }
}