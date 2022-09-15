package Lesson16;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        f1.print();
        f1.setNom(1);
        f1.setDenom(2);
        f1.print();
        Fraction f2 = new Fraction(2,5);
        f2.print();
        Fraction f3 = f1.mul(f2);
        f3.print();
    }
}
