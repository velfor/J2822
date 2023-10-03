package Lesson19;

public class Main {
    public static void main(String[] args) {
        final int size = 2;
        Student[] mas = new Student[size];
        Student s1 = new Student("Ivan","Ivanov",2121,4.5);
        Aspirant a1 = new Aspirant("Petr","Petrov",21,5.0);
        mas[0] = s1;
        mas[1] = a1;
        Student q1 = new Aspirant("Igor","Bichukov",22,4.0);
        System.out.println(q1.getScholarship());
        for (Student st : mas) {
            System.out.print(st);
            System.out.println("grant=" + st.getScholarship());
        }
    }
}
