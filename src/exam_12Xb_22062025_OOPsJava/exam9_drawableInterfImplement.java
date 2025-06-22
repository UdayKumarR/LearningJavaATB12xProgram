package exam_12Xb_22062025_OOPsJava;

public class exam9_drawableInterfImplement {
    public static void main(String[] args) {
        Drawable circle = new Circle1();
        Drawable rectangle = new Rectangle1();
        circle.draw();
        rectangle.draw();
    }
}

interface Drawable{
    void draw();
};

class Circle1 implements Drawable{
    public void draw(){
        System.out.print("Drawing a Circle ");
    }
}

class Rectangle1 implements Drawable{
    @Override
    public void draw() {
        System.out.print("Drawing a Rectangle");
    }
}
