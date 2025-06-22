package exam_12Xb_22062025_OOPsJava;

public class exam11_addMethodOverload {
    public static void main(String[] args) {
        Addition a = new Addition();
        System.out.print(" Integer Addition : "+a.add(5,3));
        System.out.print(" Double Addition : "+a.add(2.5, 3.7));
        System.out.print(" Three integers Addition : "+a.add(1,2,3));

    }
}
class Addition{
    public int add(int a, int b){
        return a+b;
    }
    public double add(double c, double d){
        return c+d;
    }
    public int add(int e, int f, int g){
        return e+f+g;
    }
}